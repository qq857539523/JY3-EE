import dao.daoutils;
import dao.userdao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Servlet",urlPatterns ="/sxm")
public class Servlet extends HttpServlet {
    private userdao ud;
    @Override
    public void init() throws ServletException {
        ud = new daoutils();
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String psw = request.getParameter("psw");
        ud.register(username,psw);
        request.getRequestDispatcher("index2.jsp").forward(request,response);
    }

}
