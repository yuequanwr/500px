package facefoo.top.a500px.widget

import facefoo.top.a500px.R
import facefoo.top.a500px.base.BaseDialog

/**
 * LoadDialog
 * Created by yuequan on 2017/8/23.
 */
class LoadDialog :BaseDialog() {

    override fun getLayoutId(): Int=R.layout.layout_load_dialog

    override fun setTheme(): Int = R.style.Theme_AppCompat_Dialog_Alert

    override fun setWindowSize(): Float =100f

    override fun bindView() {

        //是否可取消
        isCancelable = true
    }
}