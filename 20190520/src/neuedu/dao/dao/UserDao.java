package neuedu.dao.dao;

import neuedu.dao.pojp.User;

public interface UserDao {
    void regsiter(String user, String psw);
    //登录
    User login(User user);

}
