package com.neuedu.controller;

import com.neuedu.dao.userdao;
import com.neuedu.dao.userdaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "updataServlet",urlPatterns = "/sxm.3")
public class updataServlet extends HttpServlet {
    private userdao ud;

    @Override
    public void init() throws ServletException {
        ud = new userdaoImpl();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer id = Integer.valueOf(request.getParameter("id"));
        String password = request.getParameter("password");
        ud.updataUser(id,password);
    }
}
