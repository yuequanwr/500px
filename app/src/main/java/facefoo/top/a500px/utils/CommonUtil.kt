package facefoo.top.a500px.utils

import android.content.Context
import android.support.design.widget.Snackbar
import android.support.v4.content.ContextCompat
import android.view.View
import android.widget.Button
import android.widget.Toast
import facefoo.top.a500px.R

/**
 * Created by yuequan on 2017/8/23.
 */
object CommonUtil {



    /**
     * 判断当前图片是否已经设置为壁纸
     */
    fun isWallpaperInstall(context: Context,wallpaperId:String,view: Button):Boolean{

        if ( wallpaperId.equals(SharedPreferencesUtil.getWallpaperId(context))){
            view.setBackgroundResource(R.drawable.bg_wallpaper_btn_success)
            view.setText(R.string.set_wallpaper_success)
            view.isEnabled=false
            return true
        }
        else {

            return false
        }
    }
    /**
     * 根据手机的分辨率从 dp 的单位 转成为 px(像素)
     */
    fun dip2px(context: Context, dpValue: Float): Int {
        val scale = context.resources.displayMetrics.density
        return (dpValue * scale + 0.5f).toInt()
    }

    /**
     * 根据手机的分辨率从 px(像素) 的单位 转成为 dp
     */
    fun px2dip(context: Context, pxValue: Float): Int {
        val scale = context.resources.displayMetrics.density
        return (pxValue / scale + 0.5f).toInt()
    }

    /**
     * 显示SnackBar
     */
    fun showSnackBar(context: Context, view: View, text: String, color:Int=android.R.color.black, duration: Int = Snackbar.LENGTH_SHORT) {
        val mSnackBar: Snackbar = Snackbar.make(view, text, duration)
        mSnackBar.view.setBackgroundColor(ContextCompat.getColor(context, color))
        mSnackBar.show()
    }


    /**
     * Toast
     */
    fun showToast(context: Context, text: String, duration: Int = Toast.LENGTH_SHORT) {
        Toast.makeText(context, text, duration).show()
    }
}