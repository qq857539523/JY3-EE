package com.neuedu;

import com.neuedu.dao.UserDao;
import com.neuedu.dao.UserDaoImpl;
import javafx.application.Application;
import javafx.stage.Stage;

public class text {

    public static void main(String[] args) {
        String str1 = "asd";
        String str2 = "sad";
        UserDao dar = new UserDaoImpl();
        dar.regsiter(str1,str2);




    }
}
