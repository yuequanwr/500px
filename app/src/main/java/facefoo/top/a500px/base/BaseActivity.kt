package facefoo.top.a500px.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.Window
import android.view.WindowManager

/**
 * Created by yuequan on 2017/8/23.
 */

abstract class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //取消标题栏
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        //取消状态栏
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(layoutId)
        initView()
    }



    /**
     * 获取布局Id
     * @return
     */
    protected abstract val layoutId: Int


    /**
     * 初始化相关控件
     */
    protected abstract fun initView()


    fun <T : View> getViewId(id: Int): T {
        return findViewById<View>(id) as T
    }


}
