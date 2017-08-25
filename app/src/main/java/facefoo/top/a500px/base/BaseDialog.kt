package facefoo.top.a500px.base

import android.os.Bundle
import android.support.v4.app.DialogFragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import facefoo.top.a500px.R
import facefoo.top.a500px.utils.CommonUtil

/**
 * Created by yuequan on 2017/8/23.
 */
abstract class BaseDialog : DialogFragment() {
    private lateinit var rootView: View

    private var style: Int? = null
    private var theme: Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(DialogFragment.STYLE_NO_TITLE, setTheme())
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {


        if (inflater != null) {
            rootView = inflater.inflate(getLayoutId(), container, false)

            bindView()
        }
        return rootView
    }


    override fun onResume() {
        super.onResume()
        //设置窗口大小

        dialog.window.setLayout(CommonUtil.dip2px(activity, setWindowSize()),CommonUtil.dip2px(activity, setWindowSize()))
    }


    abstract fun getLayoutId(): Int
    abstract fun setTheme(): Int
    abstract fun setWindowSize():Float
    abstract fun bindView()


}