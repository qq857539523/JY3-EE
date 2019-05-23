package com.neuedu.controller;
import com.neuedu.dao.userdao;
import com.neuedu.dao.userdaoImpl;
import com.neuedu.pojo.User;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet(name = "UserServlet",urlPatterns = "/sxm")
public class UserServlet extends HttpServlet {
    private userdao ud;

    @Override
    public void init() throws ServletException {
        ud = new userdaoImpl();
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<User> allUser = ud.getAllUser();
        request.setAttribute("users",allUser);
//        request.getRequestDispatcher("OperatingInformation.jsp").forward(request,response);
        request.getRequestDispatcher("index.jsp").forward(request,response);


    }

}
