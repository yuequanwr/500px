package facefoo.top.a500px.adapter

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import facefoo.top.a500px.R
import facefoo.top.a500px.entity.AuthorPhotoEntity
import facefoo.top.a500px.utils.PicassoUtil

/**
 * Created by yuequan on 2017/8/25.
 */
class AuthorPhotoAdapter :BaseQuickAdapter<AuthorPhotoEntity.DataBean,BaseViewHolder> {

    constructor(layoutResId: Int, data: MutableList<AuthorPhotoEntity.DataBean>?) : super(layoutResId, data)

    override fun convert(helper: BaseViewHolder?, item: AuthorPhotoEntity.DataBean?) {



        helper!!.setText(R.id.tv_author_photo_nickname, item!!.title)

        PicassoUtil.loadImageView(mContext, item.url!!.p2!!,helper.getView(R.id.iv_author_photo_image))


    }
}