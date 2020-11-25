package domain;

public class user {
        private Integer id;
        private String username;
        private String address;
        private String sex;
        private String birthday;

        @Override
        public String toString() {
                return "user{" +
                                "id=" + id +
                                ", username='" + username + '\'' +
                                ", address='" + address + '\'' +
                                ", sex='" + sex + '\'' +
                                ", birthday='" + birthday + '\'' +
                                '}';
        }

        public Integer getId() {
                return id;
        }

        public void setId(Integer id) {
                this.id = id;
        }

        public String getUsername() {
                return username;
        }

        public void setUsername(String username) {
                this.username = username;
        }

        public String getAddress() {
                return address;
        }

        public void setAddress(String address) {
                this.address = address;
        }

        public String getSex() {
                return sex;
        }

        public void setSex(String sex) {
                this.sex = sex;
        }

        public String getBirthday() {
                return birthday;
        }

        public void setBirthday(String birthday) {
                this.birthday = birthday;
        }

        public user(Integer id, String username, String address, String sex, String birthday) {
                this.id = id;
                this.username = username;
                this.address = address;
                this.sex = sex;
                this.birthday = birthday;
        }

        public user() {
        }
}
