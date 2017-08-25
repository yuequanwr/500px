package facefoo.top.a500px.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter


/**
 * Created by yuequan on 2017/8/23.
 */
class ViewPagerAdapter : FragmentPagerAdapter {


    private lateinit var list: List<Fragment>
    private var title= arrayOf<String>()

    constructor(fm: FragmentManager?, list: List<Fragment>, title: Array<String>) : super(fm) {
        this.list = list
        this.title = title
    }


    override fun getItem(position: Int): Fragment {
        return list[position]
    }

    override fun getCount(): Int {
        return list.size
    }


    override fun getPageTitle(position: Int): CharSequence {
        return title[position]
    }

}