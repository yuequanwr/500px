package facefoo.top.a500px.project.hot.view

import android.content.Intent
import android.os.Bundle
import android.support.v4.widget.SwipeRefreshLayout
import android.support.v7.widget.DefaultItemAnimator
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.chad.library.adapter.base.BaseQuickAdapter

import facefoo.top.a500px.R
import facefoo.top.a500px.adapter.HotAdapter
import facefoo.top.a500px.base.BaseFragment
import facefoo.top.a500px.entity.HotPhotoEntity
import facefoo.top.a500px.project.AuthorActivity
import facefoo.top.a500px.project.PhotoDetailsActivity
import facefoo.top.a500px.widget.LoadDialog

import rx.Subscriber
import top.facefoo.featureds.utils.JumpAnimationUtil
import top.facefoo.featureds.utils.network.RetrofitClient

/**
 * Created by yuequan on 2017/8/23.
 */

class HotFragment : BaseFragment(), SwipeRefreshLayout.OnRefreshListener,
        BaseQuickAdapter.RequestLoadMoreListener,
        BaseQuickAdapter.OnItemClickListener ,BaseQuickAdapter.OnItemChildClickListener{



    private val TAG = "HotFragment"
    private var rootView: View? = null

    private var dialog = LoadDialog()
    lateinit var mRecyclerView: RecyclerView
    lateinit var mRefresh: SwipeRefreshLayout
    lateinit var mHotAdapter: HotAdapter

    private val STATE_MORE = 0
    private val STATE_REFRESH = 1
    private val STATE_NORMAL = 2
    private var state = STATE_NORMAL

    private var page = 1
    private val size = 15

    private var mList = ArrayList<HotPhotoEntity.DataBean>()

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        rootView = inflater!!.inflate(R.layout.fragment_hot, container, false)

        initView()

        return rootView
    }

    private fun initView() {

        mRecyclerView = rootView!!.findViewById(R.id.rv_recycler_view)
        mRefresh = rootView!!.findViewById(R.id.sl_refresh_layout)

        mRecyclerView.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        mRefresh.setOnRefreshListener(this)

        dialog.show(fragmentManager, "loadDialog")
        getData()

    }


    fun getData() {
        RetrofitClient.instance.getHotPhoto(page, size, object : Subscriber<HotPhotoEntity<HotPhotoEntity.DataBean>>() {
            override fun onNext(t: HotPhotoEntity<HotPhotoEntity.DataBean>?) {
                dialog.dismiss()

                Log.d(TAG, "--------------成功-------------")
                mList = t!!.data as ArrayList<HotPhotoEntity.DataBean>

                bindAdapter()
            }


            override fun onCompleted() {
                dialog.dismiss()

                Log.d(TAG, "--------------onCompleted-------------")
            }

            override fun onError(e: Throwable?) {
                dialog.dismiss()
                Log.d(TAG, "--------------失败-------------" + e.toString())
            }
        })
    }


    fun bindAdapter() {
        when (state) {

        //正常情况
            STATE_NORMAL -> {
                mHotAdapter = HotAdapter(R.layout.item_photo, mList)
                mRecyclerView.adapter = mHotAdapter
                mHotAdapter.openLoadAnimation(BaseQuickAdapter.SLIDEIN_LEFT)
            }

        //上啦家在哪更多
            STATE_MORE -> {
                mHotAdapter.addData(mList)
                mHotAdapter.loadMoreComplete()
            }


        //下拉刷新
            STATE_REFRESH -> {
                mHotAdapter.addData(0, mList)
                mRefresh.isRefreshing = false
                mRecyclerView.scrollToPosition(0)

            }


        }
        mHotAdapter.setOnLoadMoreListener(this, mRecyclerView)

        mHotAdapter.onItemClickListener = this

        mHotAdapter.onItemChildClickListener = this


    }


    /**
     * RecyclerView item点击
     */
    override fun onItemClick(adapter: BaseQuickAdapter<*, *>?, view: View, position: Int) {
        var intent=Intent(context,PhotoDetailsActivity::class.java)

        intent.putExtra("photoImageUrl", mHotAdapter.mData()[position].url!!.baseUrl+"!p3")
        intent.putExtra("photoImageId", mHotAdapter.mData()[position].id)
        intent.putExtra("mQueriedUserId",mHotAdapter.mData()[position].uploaderId)
        intent.putExtra("photoImageUrlP4", mHotAdapter.mData()[position].url!!.baseUrl+"!p4")

        intent.putExtra("photoAuthor", mHotAdapter.mData()[position].uploaderInfo!!.nickName)
        intent.putExtra("photoAuthorIc", mHotAdapter.mData()[position].uploaderInfo!!.avatar!!.baseUrl+"!p3")
        intent.putExtra("photoWidth", mHotAdapter.mData()[position].width)
        intent.putExtra("photoHeight", mHotAdapter.mData()[position].height)
        intent.putExtra("photoRatingMax", mHotAdapter.mData()[position].ratingMax)


    JumpAnimationUtil.startJumpAnimation(activity,view,intent,"PHOTO")


    }
    override fun onItemChildClick(adapter: BaseQuickAdapter<*, *>?, view: View, position: Int) {
        var intent=Intent(context, AuthorActivity::class.java)
        intent.putExtra("queriedUserId",mHotAdapter.mData()[position].uploaderId)
        JumpAnimationUtil.startJumpAnimation(activity,view,intent,"AUTHOR")

    }

    /**
     * 下拉刷新
     */
    override fun onRefresh() {
        page = 1
        state = STATE_REFRESH
        getData()

    }

    //上拉加载
    override fun onLoadMoreRequested() {
        page = ++page
        state = STATE_MORE
        getData()

    }


}

