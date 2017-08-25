package facefoo.top.a500px.entity

/**
 * Created by yuequan on 2017/8/23.
 */

class PicturePhotoEntity {


    /**
     * isRecommend : true
     * description : 又到了每周二的部落精选图片推荐时间，我们根据上一周500px各个部落图片中被点赞、收藏、热度等一系列数据，挑选出风光、人文、光影、纪实等多种摄影形式中最受欢迎的10张图片。
     * 向下翻阅，让我们一起学习欣赏。
     * title : 500px 部落图片一周精选「10」
     * photoCount : 21
     * uploaderInfo : {"nickName":"500px摄影社区","avatar":{"a1":"https://img.500px.me/cf33791224fa993890f992da405e47519_1490070353045.PNG!a1","baseUrl":"https://img.500px.me/cf33791224fa993890f992da405e47519_1490070353045.PNG"},"userName":"500px","coverUrl":{"baseUrl":"https://img.500px.me/2f5724a17e614721b94c5d9e7a95d26c.jpg","id":"cf33791224fa993890f992da405e47519"},"id":"cf33791224fa993890f992da405e47519"}
     * createdTime : 1503367972000
     * tag : ["图文故事","点评赏析"]
     * state : 0
     * id : 1711be1b7ab542d293880fafc9fd535d
     * height : 759
     * uploaderId : cf33791224fa993890f992da405e47519
     * openState : profile
     * picturePvCount : 575
     * url : {"p1":"https://img.500px.me/graphic/cf33791224fa993890f992da405e47519/3fa6d5cf3583421ab6d7e41b6d82f4b2.jpg!p1","baseUrl":"https://img.500px.me/graphic/cf33791224fa993890f992da405e47519/3fa6d5cf3583421ab6d7e41b6d82f4b2.jpg","p2":"https://img.500px.me/graphic/cf33791224fa993890f992da405e47519/3fa6d5cf3583421ab6d7e41b6d82f4b2.jpg!p2","p3":"https://img.500px.me/graphic/cf33791224fa993890f992da405e47519/3fa6d5cf3583421ab6d7e41b6d82f4b2.jpg!p3","p4":"https://img.500px.me/graphic/cf33791224fa993890f992da405e47519/3fa6d5cf3583421ab6d7e41b6d82f4b2.jpg!p4","id":"1711be1b7ab542d293880fafc9fd535d"}
     * commentCount : 3
     * pictureLikeedCount : 44
     * createdDate : 1503366641000
     * width : 1351
     * resourceType : 3
     * rating : 99.3
     * ratingMax : 99.3
     */

    var isIsRecommend: Boolean = false
    var description: String? = null
    var title: String? = null
    var photoCount: Int = 0
    var uploaderInfo: UploaderInfoBean? = null
    var createdTime: Long = 0
    var state: Int = 0
    var id: String? = null
    var height: Int = 0
    var uploaderId: String? = null
    var openState: String? = null
    var picturePvCount: Int = 0
    var url: UrlBean? = null
    var commentCount: Int = 0
    var pictureLikeedCount: Int = 0
    var createdDate: Long = 0
    var width: Int = 0
    var resourceType: Int = 0
    var rating: Double = 0.toDouble()
    var ratingMax: Double = 0.toDouble()
    var tag: List<String>? = null

    class UploaderInfoBean {
        /**
         * nickName : 500px摄影社区
         * avatar : {"a1":"https://img.500px.me/cf33791224fa993890f992da405e47519_1490070353045.PNG!a1","baseUrl":"https://img.500px.me/cf33791224fa993890f992da405e47519_1490070353045.PNG"}
         * userName : 500px
         * coverUrl : {"baseUrl":"https://img.500px.me/2f5724a17e614721b94c5d9e7a95d26c.jpg","id":"cf33791224fa993890f992da405e47519"}
         * id : cf33791224fa993890f992da405e47519
         */

        var nickName: String? = null
        var avatar: AvatarBean? = null
        var userName: String? = null
        var coverUrl: CoverUrlBean? = null
        var id: String? = null

        class AvatarBean {
            /**
             * a1 : https://img.500px.me/cf33791224fa993890f992da405e47519_1490070353045.PNG!a1
             * baseUrl : https://img.500px.me/cf33791224fa993890f992da405e47519_1490070353045.PNG
             */

            var a1: String? = null
            var baseUrl: String? = null
        }

        class CoverUrlBean {
            /**
             * baseUrl : https://img.500px.me/2f5724a17e614721b94c5d9e7a95d26c.jpg
             * id : cf33791224fa993890f992da405e47519
             */

            var baseUrl: String? = null
            var id: String? = null
        }
    }

    class UrlBean {
        /**
         * p1 : https://img.500px.me/graphic/cf33791224fa993890f992da405e47519/3fa6d5cf3583421ab6d7e41b6d82f4b2.jpg!p1
         * baseUrl : https://img.500px.me/graphic/cf33791224fa993890f992da405e47519/3fa6d5cf3583421ab6d7e41b6d82f4b2.jpg
         * p2 : https://img.500px.me/graphic/cf33791224fa993890f992da405e47519/3fa6d5cf3583421ab6d7e41b6d82f4b2.jpg!p2
         * p3 : https://img.500px.me/graphic/cf33791224fa993890f992da405e47519/3fa6d5cf3583421ab6d7e41b6d82f4b2.jpg!p3
         * p4 : https://img.500px.me/graphic/cf33791224fa993890f992da405e47519/3fa6d5cf3583421ab6d7e41b6d82f4b2.jpg!p4
         * id : 1711be1b7ab542d293880fafc9fd535d
         */

        var p1: String? = null
        var baseUrl: String? = null
        var p2: String? = null
        var p3: String? = null
        var p4: String? = null
        var id: String? = null
    }
}
