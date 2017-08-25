package facefoo.top.a500px.entity

/**
 * Created by yuequan on 2017/8/23.
 */

class HotPhotoEntity<T> {


    var message: String? = null
    var status: String? = null
    var data: List<DataBean>? = null

    class DataBean {
        /**
         * uploaderId : 500px2152695
         * openState : profile
         * origin : 500px
         * chyz : 0
         * hotUpDate : 1503414748000
         * ratingMax : 99.9
         * url : {"baseUrl":"https://img.500px.me/500px224781203.jpg","id":"500px224781203"}
         * photoCount : 0
         * uploaderInfo : {"coverUrl":{"baseUrl":"https://img.500px.me/cover-500px21526955d88123cfee24a94a0c04842ee5d4398.jpg","id":"500px2152695"},"nickName":"Adnan Bubalo","avatar":{"baseUrl":"https://img.500px.me/avatar-500px2152695dc6d5904f86645cdbe1db176241bf68c.jpg"},"id":"500px2152695","userName":"px-AdnanBubalo"}
         * width : 1283
         * xr : 0
         * id : 500px224781203
         * categoryId : 43
         * height : 1283
         * resourceType : 0
         */

        var uploaderId: String? = null
        var openState: String? = null
        var origin: String? = null
        var chyz: Int = 0
        var hotUpDate: Long = 0
        var ratingMax: Double = 0.toDouble()
        var url: UrlBean? = null
        var photoCount: Int = 0
        var uploaderInfo: UploaderInfoBean? = null
        var width: Int = 0
        var xr: Int = 0
        var id: String? = null
        var categoryId: String? = null
        var height: Int = 0
        var resourceType: Int = 0

        class UrlBean {
            /**
             * baseUrl : https://img.500px.me/500px224781203.jpg
             * id : 500px224781203
             */

            var baseUrl: String? = null
            var id: String? = null
        }

        class UploaderInfoBean {
            /**
             * coverUrl : {"baseUrl":"https://img.500px.me/cover-500px21526955d88123cfee24a94a0c04842ee5d4398.jpg","id":"500px2152695"}
             * nickName : Adnan Bubalo
             * avatar : {"baseUrl":"https://img.500px.me/avatar-500px2152695dc6d5904f86645cdbe1db176241bf68c.jpg"}
             * id : 500px2152695
             * userName : px-AdnanBubalo
             */

            var coverUrl: CoverUrlBean? = null
            var nickName: String? = null
            var avatar: AvatarBean? = null
            var id: String? = null
            var userName: String? = null

            class CoverUrlBean {
                /**
                 * baseUrl : https://img.500px.me/cover-500px21526955d88123cfee24a94a0c04842ee5d4398.jpg
                 * id : 500px2152695
                 */

                var baseUrl: String? = null
                var id: String? = null
            }

            class AvatarBean {
                /**
                 * baseUrl : https://img.500px.me/avatar-500px2152695dc6d5904f86645cdbe1db176241bf68c.jpg
                 */

                var baseUrl: String? = null
            }
        }
    }
}
