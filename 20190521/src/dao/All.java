package dao;
public class All {
    private Integer Id;
    private String UserName;
    private String PassWord;

    public All() {
    }

    public All(Integer id, String userName, String passWord) {
        Id = id;
        UserName = userName;
        PassWord = passWord;
    }

    @Override
    public String toString() {
        return "all{" +
                "Id=" + Id +
                ", UserName='" + UserName + '\'' +
                ", PassWord='" + PassWord + '\'' +
                '}';
    }

    public void setId(Integer id) {
        Id = id;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public void setPassWord(String passWord) {
        PassWord = passWord;
    }

    public Integer getId() {
        return Id;
    }

    public String getUserName() {
        return UserName;
    }

    public String getPassWord() {
        return PassWord;
    }
}
