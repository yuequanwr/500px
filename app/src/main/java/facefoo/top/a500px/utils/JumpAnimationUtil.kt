package top.facefoo.featureds.utils

import android.annotation.SuppressLint
import android.app.Activity
import android.app.ActivityOptions

import android.content.Intent
import android.os.Build
import android.view.View

import facefoo.top.a500px.widget.CircularAnim

@SuppressLint("StaticFieldLeak")
/**
 * activity 跳转动画
 * Created by yuequan on 2017/7/26.
 */

object JumpAnimationUtil {

//    private var instance:JumpAnimationUtil?=null
//
//    @Synchronized private fun createInstance(){
//        if (instance==null){
//            instance=JumpAnimationUtil
//        }
//    }
//
//    fun getInstance() :JumpAnimationUtil?{
//        if (instance==null){
//            createInstance()
//        }
//
//        return instance
//    }

    /**
     * 开始activity 视差动画
     * @param activity
     * @param view
     * @param intent
     * @param tag
     */
    fun startJumpAnimation(activity: Activity, view: View, intent: Intent,tag:String){


        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {

            if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                var mOptions = ActivityOptions.makeSceneTransitionAnimation(activity, view, tag)
                activity.startActivity(intent, mOptions.toBundle())
            } else {
                activity.startActivity(intent)
            }
        }
    }

    /**
     * 退出activity 视差动画
     * @param activity
     */
    fun endJumpAnimation(activity: Activity){
        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) activity.finishAfterTransition() else activity.finish()

    }

    /**
     * Activity 跳转 水波纹动画
     * @param activity
     * @param view
     * @param clazz
     */
    fun  <T>fullActivity(activity: Activity,view: View,clazz: Class<T>) {
        CircularAnim.fullActivity(activity, view).go {
            activity.startActivity(Intent(activity, clazz))
        }

    }
}
