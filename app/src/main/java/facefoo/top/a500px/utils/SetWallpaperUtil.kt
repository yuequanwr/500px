package facefoo.top.a500px.utils

import android.app.WallpaperManager
import android.content.Context
import android.graphics.Bitmap
import android.graphics.drawable.Drawable

import com.squareup.picasso.Picasso
import com.squareup.picasso.Target
import facefoo.top.a500px.callback.SetWallpaperCallback

/**设置壁纸
 * Created by yuequan on 2017/8/23.
 */
object SetWallpaperUtil {
lateinit var mWallpaperManager:WallpaperManager


    fun setWallpaper(context: Context, url: String,listener: SetWallpaperCallback) {
        mWallpaperManager = WallpaperManager.getInstance(context)
        Picasso
                .with(context)
                .load(url)

                .into(object :Target{
                    override fun onPrepareLoad(placeHolderDrawable: Drawable?) {
                        listener.onStart()
                    }
                    override fun onBitmapFailed(errorDrawable: Drawable?) {
                        listener.onFailed()
                    }

                    override fun onBitmapLoaded(bitmap: Bitmap?, from: Picasso.LoadedFrom?) {

                        mWallpaperManager.setBitmap(bitmap)
                        listener.onSuccess()
                    }
                })


    }


}