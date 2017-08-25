package facefoo.top.a500px.entity

/**
 * Created by yuequan on 2017/8/23.
 */

class RecommendPhotoEntity {


    /**
     * uploaderId : 500px2977031
     * rating : 88
     * title : Total Eclipse
     * ratingMax : 99.9
     * url : {"p1":"https://img.500px.me/500px224655355.jpg!p1","p2":"https://img.500px.me/500px224655355.jpg!p2","baseUrl":"https://img.500px.me/500px224655355.jpg","p3":"https://img.500px.me/500px224655355.jpg!p3","p4":"https://img.500px.me/500px224655355.jpg!p4","id":"500px224655355"}
     * photoCount : 0
     * createdDate : 1503371343371
     * uploaderInfo : {"nickName":"Adrian C. Murray","avatar":{"a1":"https://img.500px.me/avatar-500px2977031992a9b6469b0466aa19317ed54b33bb2.jpg!a1","baseUrl":"https://img.500px.me/avatar-500px2977031992a9b6469b0466aa19317ed54b33bb2.jpg"},"userName":"px-AdrianMurray","coverUrl":{"baseUrl":"https://img.500px.me/cover-500px2977031442671a3c6c34f7390dbe892d7598fd2.jpg","id":"500px2977031"},"id":"500px2977031"}
     * width : 1003
     * id : 500px224655355
     * state : 0
     * height : 1003
     * resourceType : 0
     */

    var uploaderId: String? = null
    var rating: Int = 0
    var title: String? = null
    var ratingMax: Double = 0.toDouble()
    var url: UrlBean? = null
    var photoCount: Int = 0
    var createdDate: Long = 0
    var uploaderInfo: UploaderInfoBean? = null
    var width: Int = 0
    var id: String? = null
    var state: Int = 0
    var height: Int = 0
    var resourceType: Int = 0

    class UrlBean {
        /**
         * p1 : https://img.500px.me/500px224655355.jpg!p1
         * p2 : https://img.500px.me/500px224655355.jpg!p2
         * baseUrl : https://img.500px.me/500px224655355.jpg
         * p3 : https://img.500px.me/500px224655355.jpg!p3
         * p4 : https://img.500px.me/500px224655355.jpg!p4
         * id : 500px224655355
         */

        var p1: String? = null
        var p2: String? = null
        var baseUrl: String? = null
        var p3: String? = null
        var p4: String? = null
        var id: String? = null
    }

    class UploaderInfoBean {
        /**
         * nickName : Adrian C. Murray
         * avatar : {"a1":"https://img.500px.me/avatar-500px2977031992a9b6469b0466aa19317ed54b33bb2.jpg!a1","baseUrl":"https://img.500px.me/avatar-500px2977031992a9b6469b0466aa19317ed54b33bb2.jpg"}
         * userName : px-AdrianMurray
         * coverUrl : {"baseUrl":"https://img.500px.me/cover-500px2977031442671a3c6c34f7390dbe892d7598fd2.jpg","id":"500px2977031"}
         * id : 500px2977031
         */

        var nickName: String? = null
        var avatar: AvatarBean? = null
        var userName: String? = null
        var coverUrl: CoverUrlBean? = null
        var id: String? = null

        class AvatarBean {
            /**
             * a1 : https://img.500px.me/avatar-500px2977031992a9b6469b0466aa19317ed54b33bb2.jpg!a1
             * baseUrl : https://img.500px.me/avatar-500px2977031992a9b6469b0466aa19317ed54b33bb2.jpg
             */

            var a1: String? = null
            var baseUrl: String? = null
        }

        class CoverUrlBean {
            /**
             * baseUrl : https://img.500px.me/cover-500px2977031442671a3c6c34f7390dbe892d7598fd2.jpg
             * id : 500px2977031
             */

            var baseUrl: String? = null
            var id: String? = null
        }
    }
}
