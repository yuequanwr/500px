package facefoo.top.a500px.utils

import android.content.Context
import android.content.SharedPreferences

/**
 * Created by yuequan on 2017/8/24.
 */

object SharedPreferencesUtil {

    private val WALLPAPER_KEY="wallpaperId"
    private val AUTHOR_KEY="wallpaperId"
    private val NAME="sp_500px"



    /**
     * 保存壁纸id
     *
     */
    fun saveWallpaperId(context: Context,id:String) {
        val sp = context.getSharedPreferences(NAME,Context.MODE_PRIVATE)
        sp.edit().putString(WALLPAPER_KEY,id).commit()

    }

    /**
     * 获取壁纸id
     */
    fun getWallpaperId(context: Context):String{
        val sp = context.getSharedPreferences(NAME,Context.MODE_PRIVATE)
        return sp.getString(WALLPAPER_KEY,"id")
    }

    /**
     * 保存作者id
     * @param id 作者id
     */
    fun saveAuthorId(context: Context,id:String){
        val sp=context.getSharedPreferences(NAME,Context.MODE_PRIVATE)
        sp.edit().putString(AUTHOR_KEY,id).commit()

    }

    /**
     * 获取作者id
     */
    fun getAuthorId(context: Context):String{
        var sp=context.getSharedPreferences(NAME,Context.MODE_PRIVATE)
        return sp.getString(AUTHOR_KEY,"id")
    }
}
