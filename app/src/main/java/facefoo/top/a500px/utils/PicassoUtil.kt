package facefoo.top.a500px.utils

import android.content.Context
import android.graphics.Bitmap
import android.widget.ImageView
import com.squareup.picasso.Picasso
import com.squareup.picasso.Transformation

/**
 * Created by yuequan on 2017/8/23.
 */
object PicassoUtil {
    /**
     * 指定大小加载图片

     * @param mContext   上下文
     * *
     * @param path       图片路径
     * *
     * @param width      宽
     * *
     * @param height     高
     * *
     * @param mImageView 控件
     */
    fun loadImageViewSize(mContext: Context, path: String, width: Int, height: Int, mImageView: ImageView) {
        Picasso.with(mContext).load(path).resize(CommonUtil.dip2px(mContext, width.toFloat()), CommonUtil.dip2px(mContext, height.toFloat())).centerCrop().into(mImageView)
    }


    fun loadImageView(mContext: Context, path: String, mImageView: ImageView) {
        Picasso.with(mContext).load(path).into(mImageView)
    }

    /**
     * 加载有默认图片

     * @param mContext   上下文
     * *
     * @param path       图片路径
     * *
     * @param resId      默认图片资源
     * *
     * @param mImageView 控件
     */
    fun loadImageViewHolder(mContext: Context, path: String, resId: Int, mImageView: ImageView) {
        Picasso.with(mContext).load(path).placeholder(resId).into(mImageView)
    }


    /**
     * 裁剪图片

     * @param mContext   上下文
     * *
     * @param path       图片路径
     * *
     * @param mImageView 控件
     */
    fun loadImageViewCrop(mContext: Context, path: String, mImageView: ImageView) {
        Picasso.with(mContext).load(path).transform(CropImageView()).into(mImageView)
    }

    /**
     * 自定义图片裁剪
     */
    class CropImageView : Transformation {

        override fun transform(source: Bitmap): Bitmap {
            val size = Math.min(source.width, source.height)
            val x = (source.width - size) / 2
            val y = (source.height - size) / 2

            val newBitmap = Bitmap.createBitmap(source, x, y, size, size)

            if (newBitmap != null) {
                //内存回收
                source.recycle()
            }
            return newBitmap
        }

        override fun key(): String {

            return "lgl"
        }
    }


}