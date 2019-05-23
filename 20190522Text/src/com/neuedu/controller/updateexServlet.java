package com.neuedu.controller;

import com.neuedu.pojo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "updateexServlet",urlPatterns = "/fb.do")
public class updateexServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer id = Integer.valueOf(request.getParameter("id"));
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println(password);
        User user = new User(id,username,password);
        request.setAttribute("user",user);
        request.getRequestDispatcher("updataexamine.jsp").forward(request,response);
    }
}
