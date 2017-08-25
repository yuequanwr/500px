package facefoo.top.a500px.entity

/**
 * 最新图片
 * Created by yuequan on 2017/8/23.
 */

class NewPhotoEntity {


    /**
     * uploaderId : d19d0fb6a43bc8a4fccabbb634b716241
     * title :
     * url : {"p1":"https://img.500px.me/406ecebc2980491084c530c906ba7b69.jpg!p1","p2":"https://img.500px.me/406ecebc2980491084c530c906ba7b69.jpg!p2","baseUrl":"https://img.500px.me/406ecebc2980491084c530c906ba7b69.jpg","p3":"https://img.500px.me/406ecebc2980491084c530c906ba7b69.jpg!p3","p4":"https://img.500px.me/406ecebc2980491084c530c906ba7b69.jpg!p4","id":"406ecebc2980491084c530c906ba7b69"}
     * photoCount : 0
     * createdDate : 1503456570193
     * uploaderInfo : {"nickName":"雪后风景","avatar":{"a1":"https://img.500px.me/d19d0fb6a43bc8a4fccabbb634b716241_1496932855675.jpg!a1","baseUrl":"https://img.500px.me/d19d0fb6a43bc8a4fccabbb634b716241_1496932855675.jpg"},"coverUrl":{"baseUrl":"https://img.500px.me/69602e19e9ef407d95f98443e2a396ef.jpg","id":"d19d0fb6a43bc8a4fccabbb634b716241"},"id":"d19d0fb6a43bc8a4fccabbb634b716241"}
     * width : 4032
     * id : 406ecebc2980491084c530c906ba7b69
     * state : 0
     * height : 3024
     * resourceType : 0
     * rating : 20.7
     * ratingMax : 20.7
     */

    var uploaderId: String? = null
    var title: String? = null
    var url: UrlBean? = null
    var photoCount: Int = 0
    var createdDate: Long = 0
    var uploaderInfo: UploaderInfoBean? = null
    var width: Int = 0
    var id: String? = null
    var state: Int = 0
    var height: Int = 0
    var resourceType: Int = 0
    var rating: Double = 0.toDouble()
    var ratingMax: Double = 0.toDouble()

    class UrlBean {
        /**
         * p1 : https://img.500px.me/406ecebc2980491084c530c906ba7b69.jpg!p1
         * p2 : https://img.500px.me/406ecebc2980491084c530c906ba7b69.jpg!p2
         * baseUrl : https://img.500px.me/406ecebc2980491084c530c906ba7b69.jpg
         * p3 : https://img.500px.me/406ecebc2980491084c530c906ba7b69.jpg!p3
         * p4 : https://img.500px.me/406ecebc2980491084c530c906ba7b69.jpg!p4
         * id : 406ecebc2980491084c530c906ba7b69
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
         * nickName : 雪后风景
         * avatar : {"a1":"https://img.500px.me/d19d0fb6a43bc8a4fccabbb634b716241_1496932855675.jpg!a1","baseUrl":"https://img.500px.me/d19d0fb6a43bc8a4fccabbb634b716241_1496932855675.jpg"}
         * coverUrl : {"baseUrl":"https://img.500px.me/69602e19e9ef407d95f98443e2a396ef.jpg","id":"d19d0fb6a43bc8a4fccabbb634b716241"}
         * id : d19d0fb6a43bc8a4fccabbb634b716241
         */

        var nickName: String? = null
        var avatar: AvatarBean? = null
        var coverUrl: CoverUrlBean? = null
        var id: String? = null

        class AvatarBean {
            /**
             * a1 : https://img.500px.me/d19d0fb6a43bc8a4fccabbb634b716241_1496932855675.jpg!a1
             * baseUrl : https://img.500px.me/d19d0fb6a43bc8a4fccabbb634b716241_1496932855675.jpg
             */

            var a1: String? = null
            var baseUrl: String? = null
        }

        class CoverUrlBean {
            /**
             * baseUrl : https://img.500px.me/69602e19e9ef407d95f98443e2a396ef.jpg
             * id : d19d0fb6a43bc8a4fccabbb634b716241
             */

            var baseUrl: String? = null
            var id: String? = null
        }
    }
}
