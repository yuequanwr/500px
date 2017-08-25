package facefoo.top.a500px.callback

/**设置壁纸 监听
 * Created by yuequan on 2017/8/24.
 */
interface SetWallpaperCallback {

    /**
     * 开始加载
     */
    fun onStart()

    /**
     * 加载失败
     */
    fun onFailed()

    /**
     * 加载成功
     */
    fun onSuccess()
}