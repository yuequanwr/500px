package top.facefoo.featureds.utils.network


import facefoo.top.a500px.entity.AuthorInformationEntity
import facefoo.top.a500px.entity.AuthorPhotoEntity
import facefoo.top.a500px.entity.HotPhotoEntity
import facefoo.top.a500px.retrofit.ApiManager
import java.util.concurrent.TimeUnit


import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import rx.Subscriber
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers

/**
 * Created by yuequan on 2017/7/25.
 */

class RetrofitClient
/**
 * 私有构造方法
 */
private constructor() {
private val BASE_URL="https://500px.me/"
    private val mRetrofit: Retrofit
    private val mApiService: ApiManager

    init {
        val builder = OkHttpClient.Builder()
        builder.connectTimeout(DEFAULT_TIMEOUT.toLong(), TimeUnit.SECONDS)
        mRetrofit = Retrofit.Builder()
                .client(builder.build())
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build()
        mApiService = mRetrofit.create(ApiManager::class.java)
    }

    companion object {
        val DEFAULT_TIMEOUT = 5

        private var mInstance: RetrofitClient? = null

        val instance: RetrofitClient
            get() {
                if (mInstance == null) {
                    synchronized(RetrofitClient::class.java) {
                        mInstance = RetrofitClient()
                    }
                }
                return mInstance!!
            }
    }



    /**
     * 获取热图片列表
     * @param subscriber
     */
    fun getHotPhoto(currPage: Int, currSize: Int, subscriber: Subscriber<HotPhotoEntity<HotPhotoEntity.DataBean>>) {
        var map = HashMap<String, Int>()

        map.put("page", currPage)
        map.put("size", currSize)

        mApiService.getHotPhoto(map)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber)
    }

    /**
     * 获取作者信息
     * @param queriedUserId 图片id
     */
    fun getAuthorInformation(queriedUserId:String,subscriber: Subscriber<AuthorInformationEntity>){

        mApiService.getAuthorInformation(queriedUserId)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber)

    }

    /**
     * 获取作者图片列表
     * @param size
     * @param page
     * @param queriedUserId
     */
    fun getAuthorPhoto(queriedUserId:String,page:Int,size:Int,subscriber: Subscriber<AuthorPhotoEntity<AuthorPhotoEntity.DataBean>>){
        var map=HashMap<String,String>()

        map.put("queriedUserId",queriedUserId)
        map.put("page",page.toString())
        map.put("size",size.toString())

        mApiService.getAuthorPhoto(map)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber)

    }








}

