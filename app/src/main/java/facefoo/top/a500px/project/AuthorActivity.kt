package facefoo.top.a500px.project


import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.View
import com.chad.library.adapter.base.BaseQuickAdapter
import facefoo.top.a500px.R
import facefoo.top.a500px.adapter.AuthorPhotoAdapter
import facefoo.top.a500px.base.BaseActivity
import facefoo.top.a500px.entity.AuthorInformationEntity
import facefoo.top.a500px.entity.AuthorPhotoEntity
import facefoo.top.a500px.utils.PicassoUtil

import kotlinx.android.synthetic.main.activity_author.*
import kotlinx.android.synthetic.main.layout_user_detail.*
import rx.Subscriber
import top.facefoo.featureds.utils.JumpAnimationUtil
import top.facefoo.featureds.utils.network.RetrofitClient


class AuthorActivity : BaseActivity(), BaseQuickAdapter.RequestLoadMoreListener, View.OnClickListener {


    private val TAG = "AuthorActivity"
    override val layoutId: Int = R.layout.activity_author

    private lateinit var mRecyclerView: RecyclerView
    private var queriedUserId: String? = null
    private var page = 1
    private var size = 15

    private var mList = ArrayList<AuthorPhotoEntity.DataBean>()


    private lateinit var mAuthorPhotoAdapter: AuthorPhotoAdapter


    private val STATE_MORE = 0
    private val STATE_REFRESH = 1
    private val STATE_NORMAL = 2
    private var state = STATE_NORMAL

    override fun initView() {

        var intent = intent
        var bundle = intent.extras
        queriedUserId = bundle.getString("queriedUserId")

        mRecyclerView = findViewById(R.id.author_recycler_view)
        mRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)



        iv_back.setOnClickListener(this)
        showHeader()
        getData()
    }


    private fun showHeader() {


        RetrofitClient.instance.getAuthorInformation(queriedUserId!!, object : Subscriber<AuthorInformationEntity>() {
            override fun onCompleted() {

            }

            override fun onNext(t: AuthorInformationEntity) {

                Log.d(TAG, "成功" + t.data.about)
                PicassoUtil.loadImageView(this@AuthorActivity, t.data.coverUrl.p3, iv_author_header)
                PicassoUtil.loadImageView(this@AuthorActivity, t.data.avatar.baseUrl + "!p3", iv_author_ic)

                tv_nickname.text = t!!.data.nickName
            }

            override fun onError(e: Throwable?) {
                Log.d(TAG, "失败" + e.toString())
            }

        })


    }

    fun getData() {
        RetrofitClient.instance.getAuthorPhoto(queriedUserId!!, page, size, object : Subscriber<AuthorPhotoEntity<AuthorPhotoEntity.DataBean>>() {
            override fun onCompleted() {

            }

            override fun onNext(t: AuthorPhotoEntity<AuthorPhotoEntity.DataBean>?) {
                Log.d(TAG, "getData成功")
                mList = t!!.data as ArrayList<AuthorPhotoEntity.DataBean>
                bindAdapter()
            }

            override fun onError(e: Throwable?) {

                Log.d(TAG, "getData失败" + e.toString())
            }

        })

    }

    private fun bindAdapter() {
        when (state) {
            STATE_NORMAL -> {
                mAuthorPhotoAdapter = AuthorPhotoAdapter(R.layout.item_authot_photo, mList)
                mRecyclerView.adapter = mAuthorPhotoAdapter
                mAuthorPhotoAdapter.openLoadAnimation(BaseQuickAdapter.SLIDEIN_LEFT)
            }

            STATE_MORE -> {
                mAuthorPhotoAdapter.addData(mList)
                mAuthorPhotoAdapter.loadMoreComplete()

            }

        }

        mAuthorPhotoAdapter.setOnLoadMoreListener(this@AuthorActivity, mRecyclerView)

    }


    /**
     * 下拉加载更多
     */
    override fun onLoadMoreRequested() {

        page += 1
        state = STATE_MORE
        getData()

    }


    override fun onClick(view: View?) {
        when (view!!.id) {
            R.id.iv_back ->JumpAnimationUtil.endJumpAnimation(this@AuthorActivity)
        }
    }

}
