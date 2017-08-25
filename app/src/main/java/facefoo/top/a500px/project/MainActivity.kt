package facefoo.top.a500px.project

import android.support.v4.app.Fragment
import android.view.View
import facefoo.top.a500px.adapter.ViewPagerAdapter
import facefoo.top.a500px.base.BaseActivity
import facefoo.top.a500px.project.Teletext.view.TeletextFragment
import facefoo.top.a500px.project.hot.view.HotFragment
import facefoo.top.a500px.project.news.view.NewFragment
import facefoo.top.a500px.project.rank.view.RankFragment
import facefoo.top.a500px.project.recommend.view.RecommendFragment
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList
import android.content.Intent
import facefoo.top.a500px.R
import facefoo.top.a500px.project.user.UserActivity
import kotlinx.android.synthetic.main.layout_main_toolbar.*
import top.facefoo.featureds.utils.JumpAnimationUtil


class MainActivity : BaseActivity(), View.OnClickListener {


    override val layoutId: Int = R.layout.activity_main

    private var mFragmentList = ArrayList<Fragment>()

    private lateinit var mAdapter: ViewPagerAdapter
    private val mPagerTitle = arrayOf("热门", "排名", "新作", "推荐", "图文")


    override fun initView() {

        initTabLayout()


        iv_search.setOnClickListener(this)
        iv_user.setOnClickListener(this)

    }

    private fun initTabLayout() {

        mFragmentList.add(HotFragment())
        mFragmentList.add(RankFragment())
        mFragmentList.add(NewFragment())
        mFragmentList.add(RecommendFragment())
        mFragmentList.add(TeletextFragment())

        mAdapter = ViewPagerAdapter(supportFragmentManager, mFragmentList, mPagerTitle)

        vp_view_pager.adapter = mAdapter


    }

    override fun onClick(view: View?) {
        when (view!!.id) {


            R.id.iv_user -> {
                var intent=Intent(this@MainActivity,UserActivity::class.java)
               JumpAnimationUtil.startJumpAnimation(this@MainActivity,view,intent,"USER")
            }

            R.id.iv_search ->
                JumpAnimationUtil.fullActivity(this@MainActivity, view, SearchActivity::class.java)

        }
    }
}
