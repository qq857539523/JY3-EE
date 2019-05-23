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

@WebServlet(name = "UpdataexServlet",urlPatterns = "/fb2.do")
public class UpdataexServlet extends HttpServlet {
    private userdao ud;

    @Override
    public void init() throws ServletException {
        ud = new userdaoImpl();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer id = Integer.valueOf(request.getParameter("id"));
        String username = request.getParameter("username");
        String password= request.getParameter("password");
        User user = new User(id,username,password);
        ud.updataexUser(user);
        request.getRequestDispatcher("fb").forward(request,response);
    }
}
