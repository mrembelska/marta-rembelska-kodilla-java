package Challenges;

public class User {
    private String UserName;
    private String UserSurname;
    private String UserAddressEmail;
    private String UserMobNumber;

    public User(String userName, String userSurname, String userAddressEmail, String userMobNumber) {
        UserName = userName;
        UserSurname = userSurname;
        UserAddressEmail = userAddressEmail;
        UserMobNumber = userMobNumber;
    }

    public String getUserName() {
        return UserName;
    }

    public String getUserSurname() {
        return UserSurname;
    }

    public String getUserAddressEmail() {
        return UserAddressEmail;
    }

    public String getUserMobNumber() {
        return UserMobNumber;
    }

    @Override
    public  boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (!UserName.equals(user.UserName)) return false;
        if (!UserSurname.equals(user.UserSurname)) return false;
        if (!UserAddressEmail.equals(user.UserAddressEmail)) return false;
        return UserMobNumber.equals(user.UserMobNumber);
    }

    @Override
    public int hashCode() {
        int result = UserName.hashCode();
        result = 31 * result + UserSurname.hashCode();
        result = 31 * result + UserAddressEmail.hashCode();
        result = 31 * result + UserMobNumber.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "UserName='" + UserName + '\'' +
                ", UserSurname='" + UserSurname + '\'' +
                ", UserAddressEmail='" + UserAddressEmail + '\'' +
                ", UserMobNumber='" + UserMobNumber + '\'' +
                '}';
    }
}
