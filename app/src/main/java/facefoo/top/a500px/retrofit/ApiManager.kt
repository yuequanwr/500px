package facefoo.top.a500px.retrofit


import facefoo.top.a500px.entity.AuthorInformationEntity
import facefoo.top.a500px.entity.AuthorPhotoEntity
import facefoo.top.a500px.entity.HotPhotoEntity
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.QueryMap
import rx.Observable

/**  api工具类
 * Created by yuequan on 2017/8/23.
 */
interface ApiManager {


    /**
     * 获取热门图片列表
     * @param page
     * @param size
     */
    @GET("discover/rating?resourceType=0,2&category=&orderBy=rating&photographerType=&type=json")
    fun getHotPhoto(@QueryMap map:Map<String,Int>):Observable<HotPhotoEntity<HotPhotoEntity.DataBean>>


    /**
     * 获取作者信息
     * @param queriedUserId 图片id
     */
    @GET("community/v2/user/indexInfo?")
    fun getAuthorInformation(@Query("queriedUserId") queriedUserId:String):Observable<AuthorInformationEntity>

    /**
     * 获取作者图片列表
     */
    @GET("community/v2/user/profile?resourceType=0,2&imgsize=p1,p2,p3&type=json")
    fun getAuthorPhoto(@QueryMap map: Map<String, String>) :Observable<AuthorPhotoEntity<AuthorPhotoEntity.DataBean>>


}