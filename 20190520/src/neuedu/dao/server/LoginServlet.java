package neuedu.dao.server;

import neuedu.dao.dao.UserDaoImpl;
import neuedu.dao.pojp.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginServlet",urlPatterns = "/sxm")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("username");
        String psw = request.getParameter("psw");
        UserDaoImpl userDao = new UserDaoImpl();
        User user1 = userDao.login(new User(user,psw));
        if (null != user1){
            request.getRequestDispatcher("log.jsp").forward(request,response);
        }else {
            request.getRequestDispatcher("Login.html").forward(request,response);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
