package facefoo.top.a500px.entity

/**
 * Created by yuequan on 2017/8/23.
 */

class RankPhotoEntity {


    /**
     * uploaderId : 500px771462
     * rating : 72.2
     * title : {9912}
     * ratingMax : 72.2
     * url : {"p1":"https://img.500px.me/500px224863077.jpg!p1","p2":"https://img.500px.me/500px224863077.jpg!p2","baseUrl":"https://img.500px.me/500px224863077.jpg","p3":"https://img.500px.me/500px224863077.jpg!p3","p4":"https://img.500px.me/500px224863077.jpg!p4","id":"500px224863077"}
     * photoCount : 0
     * createdDate : 1503456242419
     * uploaderInfo : {"nickName":"Jo Lynn Zamudio","avatar":{"a1":"https://img.500px.me/avatar-500px771462f11ab7cf53bf46f5af01e92852436a58.jpg!a1","baseUrl":"https://img.500px.me/avatar-500px771462f11ab7cf53bf46f5af01e92852436a58.jpg"},"userName":"px-JoLynn","coverUrl":{"baseUrl":"https://img.500px.me/cover-500px7714626a6040d3216a4b82b043e06a0c913fa3.jpg","id":"500px771462"},"id":"500px771462"}
     * width : 2000
     * id : 500px224863077
     * state : 0
     * height : 1281
     * resourceType : 0
     */

    var uploaderId: String? = null
    var rating: Double = 0.toDouble()
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
         * p1 : https://img.500px.me/500px224863077.jpg!p1
         * p2 : https://img.500px.me/500px224863077.jpg!p2
         * baseUrl : https://img.500px.me/500px224863077.jpg
         * p3 : https://img.500px.me/500px224863077.jpg!p3
         * p4 : https://img.500px.me/500px224863077.jpg!p4
         * id : 500px224863077
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
         * nickName : Jo Lynn Zamudio
         * avatar : {"a1":"https://img.500px.me/avatar-500px771462f11ab7cf53bf46f5af01e92852436a58.jpg!a1","baseUrl":"https://img.500px.me/avatar-500px771462f11ab7cf53bf46f5af01e92852436a58.jpg"}
         * userName : px-JoLynn
         * coverUrl : {"baseUrl":"https://img.500px.me/cover-500px7714626a6040d3216a4b82b043e06a0c913fa3.jpg","id":"500px771462"}
         * id : 500px771462
         */

        var nickName: String? = null
        var avatar: AvatarBean? = null
        var userName: String? = null
        var coverUrl: CoverUrlBean? = null
        var id: String? = null

        class AvatarBean {
            /**
             * a1 : https://img.500px.me/avatar-500px771462f11ab7cf53bf46f5af01e92852436a58.jpg!a1
             * baseUrl : https://img.500px.me/avatar-500px771462f11ab7cf53bf46f5af01e92852436a58.jpg
             */

            var a1: String? = null
            var baseUrl: String? = null
        }

        class CoverUrlBean {
            /**
             * baseUrl : https://img.500px.me/cover-500px7714626a6040d3216a4b82b043e06a0c913fa3.jpg
             * id : 500px771462
             */

            var baseUrl: String? = null
            var id: String? = null
        }
    }
}
