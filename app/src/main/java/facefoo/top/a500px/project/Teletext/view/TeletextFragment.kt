package facefoo.top.a500px.project.Teletext.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import facefoo.top.a500px.R
import facefoo.top.a500px.base.BaseFragment

/**
 * Created by yuequan on 2017/8/23.
 */
class TeletextFragment :BaseFragment() {
    private var rootView: View? = null


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        rootView = inflater!!.inflate(R.layout.fragment_teletext, container, false)
        //初始化控件

        return rootView
    }


     fun getData() {

    }

}