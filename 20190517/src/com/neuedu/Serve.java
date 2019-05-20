package com.neuedu;

import com.neuedu.dao.UserDao;
import com.neuedu.dao.UserDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "com.neuedu.Serve",urlPatterns = "/sxm")
public class Serve extends HttpServlet {
    private UserDao ud;
    @Override
    public void init() throws ServletException {
        ud = new UserDaoImpl();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        response.getWriter().write("Hello Servlet");
    String usm = request.getParameter("usm");
    String psw = request.getParameter("psw");
//        System.out.println( usm + "," + psw);
        ud.regsiter(usm,psw);
        //跳转页面
        request.getRequestDispatcher("login.jsp").forward(request,response);
    }


}
