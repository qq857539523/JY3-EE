package dao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "Servlet2",urlPatterns = "/sxm.do")
public class Servlet2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        List<All> names = new daoutils().alls();
//        ArrayList<String> names = new ArrayList<>();
//        names.add("张三");
//        names.add("李四");
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<All> names = new daoutils().alls();
//        ArrayList<String> names = new ArrayList<>();
//        names.add("张三");
//        names.add("李四");
//        names.add("王五");
        request.setAttribute("name",names);
        request.getRequestDispatcher("AllMessage.jsp").forward(request,response);
    }
}
