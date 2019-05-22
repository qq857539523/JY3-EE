package com.neuedu.controller;

import com.neuedu.dao.userdao;
import com.neuedu.dao.userdaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "addServlet",urlPatterns = "/sxm.1")
public class addServlet extends HttpServlet {
    private userdao ud;

    @Override
    public void init() throws ServletException {
        ud = new userdaoImpl();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("usm");
        String password = request.getParameter("psw");
        ud.addUser(username,password);
    }
}
