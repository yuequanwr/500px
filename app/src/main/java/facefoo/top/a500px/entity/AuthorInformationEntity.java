package facefoo.top.a500px.entity;

/**
 * Created by yuequan on 2017/8/25.
 */

public class AuthorInformationEntity {


    /**
     * data : {"userGraphicCount":0,"userAllPhotoCount":1364,"city":"Yekaterinburg","recommendTime":1498447719000,"about":"Instagram @sean_archer_photo","userFolloweeCount":1,"markUser":{"finishIn":0,"markCount":0,"prize":0,"star":0},"userAllSetCount":0,"coutry":"Russia","userFollowedCount":4230,"createdTime":1470307728000,"userLikerCount":27,"state":1,"id":"500px777395","lastLoginType":0,"userPvCount":0,"nickName":"Sean Archer","lastlogin":1470307728000,"isMarkUser":false,"avatar":{"a1":"https://img.500px.me/avatar-500px7773956c30628b0b0048ac9cd5924ccfe57bb0.jpg!a1","baseUrl":"https://img.500px.me/avatar-500px7773956c30628b0b0048ac9cd5924ccfe57bb0.jpg"},"userName":"px-SeanArcher","userJoinTribeCount":0,"coverUrl":{"baseUrl":"https://img.500px.me/cover-500px7773956c4d427ca9dc4d2e9f5399bc4b3b5d9f.jpg","p3":"https://img.500px.me/cover-500px7773956c4d427ca9dc4d2e9f5399bc4b3b5d9f.jpg!p3","p5":"https://img.500px.me/cover-500px7773956c4d427ca9dc4d2e9f5399bc4b3b5d9f.jpg!p5","id":"500px777395"},"userSetCount":0,"userPvedCount":806036,"userProfilePhotoCount":480}
     * message : success
     * status : 200
     */

    private DataBean data;
    private String message;
    private String status;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static class DataBean {
        /**
         * userGraphicCount : 0
         * userAllPhotoCount : 1364
         * city : Yekaterinburg
         * recommendTime : 1498447719000
         * about : Instagram @sean_archer_photo
         * userFolloweeCount : 1
         * markUser : {"finishIn":0,"markCount":0,"prize":0,"star":0}
         * userAllSetCount : 0
         * coutry : Russia
         * userFollowedCount : 4230
         * createdTime : 1470307728000
         * userLikerCount : 27
         * state : 1
         * id : 500px777395
         * lastLoginType : 0
         * userPvCount : 0
         * nickName : Sean Archer
         * lastlogin : 1470307728000
         * isMarkUser : false
         * avatar : {"a1":"https://img.500px.me/avatar-500px7773956c30628b0b0048ac9cd5924ccfe57bb0.jpg!a1","baseUrl":"https://img.500px.me/avatar-500px7773956c30628b0b0048ac9cd5924ccfe57bb0.jpg"}
         * userName : px-SeanArcher
         * userJoinTribeCount : 0
         * coverUrl : {"baseUrl":"https://img.500px.me/cover-500px7773956c4d427ca9dc4d2e9f5399bc4b3b5d9f.jpg","p3":"https://img.500px.me/cover-500px7773956c4d427ca9dc4d2e9f5399bc4b3b5d9f.jpg!p3","p5":"https://img.500px.me/cover-500px7773956c4d427ca9dc4d2e9f5399bc4b3b5d9f.jpg!p5","id":"500px777395"}
         * userSetCount : 0
         * userPvedCount : 806036
         * userProfilePhotoCount : 480
         */

        private int userGraphicCount;
        private int userAllPhotoCount;
        private String city;
        private long recommendTime;
        private String about;
        private int userFolloweeCount;
        private MarkUserBean markUser;
        private int userAllSetCount;
        private String coutry;
        private int userFollowedCount;
        private long createdTime;
        private int userLikerCount;
        private int state;
        private String id;
        private int lastLoginType;
        private int userPvCount;
        private String nickName;
        private long lastlogin;
        private boolean isMarkUser;
        private AvatarBean avatar;
        private String userName;
        private int userJoinTribeCount;
        private CoverUrlBean coverUrl;
        private int userSetCount;
        private int userPvedCount;
        private int userProfilePhotoCount;

        public int getUserGraphicCount() {
            return userGraphicCount;
        }

        public void setUserGraphicCount(int userGraphicCount) {
            this.userGraphicCount = userGraphicCount;
        }

        public int getUserAllPhotoCount() {
            return userAllPhotoCount;
        }

        public void setUserAllPhotoCount(int userAllPhotoCount) {
            this.userAllPhotoCount = userAllPhotoCount;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public long getRecommendTime() {
            return recommendTime;
        }

        public void setRecommendTime(long recommendTime) {
            this.recommendTime = recommendTime;
        }

        public String getAbout() {
            return about;
        }

        public void setAbout(String about) {
            this.about = about;
        }

        public int getUserFolloweeCount() {
            return userFolloweeCount;
        }

        public void setUserFolloweeCount(int userFolloweeCount) {
            this.userFolloweeCount = userFolloweeCount;
        }

        public MarkUserBean getMarkUser() {
            return markUser;
        }

        public void setMarkUser(MarkUserBean markUser) {
            this.markUser = markUser;
        }

        public int getUserAllSetCount() {
            return userAllSetCount;
        }

        public void setUserAllSetCount(int userAllSetCount) {
            this.userAllSetCount = userAllSetCount;
        }

        public String getCoutry() {
            return coutry;
        }

        public void setCoutry(String coutry) {
            this.coutry = coutry;
        }

        public int getUserFollowedCount() {
            return userFollowedCount;
        }

        public void setUserFollowedCount(int userFollowedCount) {
            this.userFollowedCount = userFollowedCount;
        }

        public long getCreatedTime() {
            return createdTime;
        }

        public void setCreatedTime(long createdTime) {
            this.createdTime = createdTime;
        }

        public int getUserLikerCount() {
            return userLikerCount;
        }

        public void setUserLikerCount(int userLikerCount) {
            this.userLikerCount = userLikerCount;
        }

        public int getState() {
            return state;
        }

        public void setState(int state) {
            this.state = state;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public int getLastLoginType() {
            return lastLoginType;
        }

        public void setLastLoginType(int lastLoginType) {
            this.lastLoginType = lastLoginType;
        }

        public int getUserPvCount() {
            return userPvCount;
        }

        public void setUserPvCount(int userPvCount) {
            this.userPvCount = userPvCount;
        }

        public String getNickName() {
            return nickName;
        }

        public void setNickName(String nickName) {
            this.nickName = nickName;
        }

        public long getLastlogin() {
            return lastlogin;
        }

        public void setLastlogin(long lastlogin) {
            this.lastlogin = lastlogin;
        }

        public boolean isIsMarkUser() {
            return isMarkUser;
        }

        public void setIsMarkUser(boolean isMarkUser) {
            this.isMarkUser = isMarkUser;
        }

        public AvatarBean getAvatar() {
            return avatar;
        }

        public void setAvatar(AvatarBean avatar) {
            this.avatar = avatar;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public int getUserJoinTribeCount() {
            return userJoinTribeCount;
        }

        public void setUserJoinTribeCount(int userJoinTribeCount) {
            this.userJoinTribeCount = userJoinTribeCount;
        }

        public CoverUrlBean getCoverUrl() {
            return coverUrl;
        }

        public void setCoverUrl(CoverUrlBean coverUrl) {
            this.coverUrl = coverUrl;
        }

        public int getUserSetCount() {
            return userSetCount;
        }

        public void setUserSetCount(int userSetCount) {
            this.userSetCount = userSetCount;
        }

        public int getUserPvedCount() {
            return userPvedCount;
        }

        public void setUserPvedCount(int userPvedCount) {
            this.userPvedCount = userPvedCount;
        }

        public int getUserProfilePhotoCount() {
            return userProfilePhotoCount;
        }

        public void setUserProfilePhotoCount(int userProfilePhotoCount) {
            this.userProfilePhotoCount = userProfilePhotoCount;
        }

        public static class MarkUserBean {
            /**
             * finishIn : 0
             * markCount : 0
             * prize : 0
             * star : 0
             */

            private int finishIn;
            private int markCount;
            private int prize;
            private int star;

            public int getFinishIn() {
                return finishIn;
            }

            public void setFinishIn(int finishIn) {
                this.finishIn = finishIn;
            }

            public int getMarkCount() {
                return markCount;
            }

            public void setMarkCount(int markCount) {
                this.markCount = markCount;
            }

            public int getPrize() {
                return prize;
            }

            public void setPrize(int prize) {
                this.prize = prize;
            }

            public int getStar() {
                return star;
            }

            public void setStar(int star) {
                this.star = star;
            }
        }

        public static class AvatarBean {
            /**
             * a1 : https://img.500px.me/avatar-500px7773956c30628b0b0048ac9cd5924ccfe57bb0.jpg!a1
             * baseUrl : https://img.500px.me/avatar-500px7773956c30628b0b0048ac9cd5924ccfe57bb0.jpg
             */

            private String a1;
            private String baseUrl;

            public String getA1() {
                return a1;
            }

            public void setA1(String a1) {
                this.a1 = a1;
            }

            public String getBaseUrl() {
                return baseUrl;
            }

            public void setBaseUrl(String baseUrl) {
                this.baseUrl = baseUrl;
            }
        }

        public static class CoverUrlBean {
            /**
             * baseUrl : https://img.500px.me/cover-500px7773956c4d427ca9dc4d2e9f5399bc4b3b5d9f.jpg
             * p3 : https://img.500px.me/cover-500px7773956c4d427ca9dc4d2e9f5399bc4b3b5d9f.jpg!p3
             * p5 : https://img.500px.me/cover-500px7773956c4d427ca9dc4d2e9f5399bc4b3b5d9f.jpg!p5
             * id : 500px777395
             */

            private String baseUrl;
            private String p3;
            private String p5;
            private String id;

            public String getBaseUrl() {
                return baseUrl;
            }

            public void setBaseUrl(String baseUrl) {
                this.baseUrl = baseUrl;
            }

            public String getP3() {
                return p3;
            }

            public void setP3(String p3) {
                this.p3 = p3;
            }

            public String getP5() {
                return p5;
            }

            public void setP5(String p5) {
                this.p5 = p5;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }
        }
    }
}
