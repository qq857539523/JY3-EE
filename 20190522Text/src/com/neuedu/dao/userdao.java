package com.neuedu.dao;

import com.neuedu.pojo.Product;
import com.neuedu.pojo.User;

import java.util.List;

public interface userdao {
    //查看所有
    public List<User> getAllUser();
    //添加
    public void addUser(String username,String password);
    //删除
    public void deleteUser(Integer id);
    //修改
    public void updataUser(Integer id,String password);

    //20190523新添加修改
    void  updataexUser(User user);
    //20190523晚上新项目   查询
    public List<Product> Progetall();

}
