package facefoo.top.a500px.adapter


import android.view.View

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import facefoo.top.a500px.R
import facefoo.top.a500px.entity.HotPhotoEntity
import facefoo.top.a500px.utils.PicassoUtil
import facefoo.top.a500px.widget.CircleImageView


/**
 * Created by yuequan on 2017/8/23.
 */
class HotAdapter : BaseQuickAdapter<HotPhotoEntity.DataBean, BaseViewHolder> {
    constructor(layoutResId: Int, data: MutableList<HotPhotoEntity.DataBean>?) : super(layoutResId, data)


    override fun convert(helper: BaseViewHolder?, item: HotPhotoEntity.DataBean?) {
        helper!!.setText(R.id.item_photo_author, item!!.uploaderInfo!!.nickName)
                .addOnClickListener(R.id.item_photo_ic)


        PicassoUtil.loadImageView(mContext, item.url!!.baseUrl!! + "!p3", helper.getView(R.id.item_photo_image))

        PicassoUtil.loadImageView(mContext, item.uploaderInfo!!.avatar!!.baseUrl + "!p3", helper.getView<View>(R.id.item_photo_ic) as CircleImageView)
    }

    fun mData(): List<HotPhotoEntity.DataBean> {
        return mData
    }


}