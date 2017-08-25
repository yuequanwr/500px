package facefoo.top.a500px.project

import android.content.Intent
import android.view.View
import facefoo.top.a500px.R
import facefoo.top.a500px.base.BaseActivity
import facefoo.top.a500px.callback.SetWallpaperCallback
import facefoo.top.a500px.utils.CommonUtil
import facefoo.top.a500px.utils.PicassoUtil
import facefoo.top.a500px.utils.SetWallpaperUtil
import facefoo.top.a500px.utils.SharedPreferencesUtil
import facefoo.top.a500px.widget.CircularAnim

import kotlinx.android.synthetic.main.activity_photo_details.*
import kotlinx.android.synthetic.main.layout_photo_nav.*
import kotlinx.android.synthetic.main.layout_user_detail.*
import top.facefoo.featureds.utils.JumpAnimationUtil

class PhotoDetailsActivity : BaseActivity(), View.OnClickListener {


    private var mImageUrl: String? = null
    private var mImageId: String? = null
    private var mImageUrlP4: String? = null
    private var mAuthor: String? = null
    private var mAuthorIcUrl: String? = null
    private var mRatingMax: Double? = null
    private var mWidth: Int? = null
    private var mHeight: Int? = null
    private var mQueriedUserId:String?=null
    override val layoutId: Int = R.layout.activity_photo_details

    override fun initView() {
        var intent = intent
        var bundle = intent.extras
        mImageUrl = bundle.getString("photoImageUrl")
        mImageId = bundle.getString("photoImageId")

        mQueriedUserId=bundle.getString("mQueriedUserId")
        mImageUrlP4 = bundle.getString("photoImageUrlP4")
        mAuthor = bundle.getString("photoAuthor")
        mAuthorIcUrl = bundle.getString("photoAuthorIc")
        mRatingMax = bundle.getDouble("photoRatingMax")
        mWidth = bundle.getInt("photoWidth")
        mHeight = bundle.getInt("photoHeight")


        CommonUtil.isWallpaperInstall(this@PhotoDetailsActivity, mImageId.toString(), btn_photo_nav_between)

        btn_photo_nav_between.setOnClickListener(this)

        iv_author_ic.setOnClickListener(this)

        iv_back.setOnClickListener(this)

        showData()
    }

    private fun showData() {
        PicassoUtil.loadImageView(this@PhotoDetailsActivity, mImageUrl!!, iv_photo_detail_image)
        PicassoUtil.loadImageView(this@PhotoDetailsActivity, mAuthorIcUrl!!, iv_author_ic)
    }

    override fun onClick(view: View?) {
        when (view!!.id) {

            R.id.iv_back ->JumpAnimationUtil.endJumpAnimation(this@PhotoDetailsActivity)
            R.id.btn_photo_nav_between -> {

                SetWallpaperUtil.setWallpaper(this@PhotoDetailsActivity, mImageUrlP4!!, object : SetWallpaperCallback {
                    override fun onStart() {
                        CircularAnim.hide(btn_photo_nav_between).go()
                        pb_progress.visibility = View.VISIBLE
                    }

                    override fun onFailed() {

                    }

                    override fun onSuccess() {
                        pb_progress.visibility = View.GONE
                        CircularAnim.show(btn_photo_nav_between).go()
                        btn_photo_nav_between.setBackgroundResource(R.drawable.bg_wallpaper_btn_success)
                        btn_photo_nav_between.text = resources.getString(R.string.set_wallpaper_success)
                        btn_photo_nav_between.isEnabled = false
                        SharedPreferencesUtil.saveWallpaperId(this@PhotoDetailsActivity, mImageId.toString())

                    }

                })

            }

            R.id.iv_author_ic ->{
                var intent=Intent(this@PhotoDetailsActivity,AuthorActivity::class.java)
                intent.putExtra("queriedUserId",mQueriedUserId)
                JumpAnimationUtil.startJumpAnimation(this@PhotoDetailsActivity,view,intent,"AUTHOR")
            }
        }
    }


}
