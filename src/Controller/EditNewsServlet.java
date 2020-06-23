package Controller;

import Entity.News;
import Service.NewsService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "EditNewsServlet")
public class EditNewsServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

        request.setCharacterEncoding("UTF-8");
        int newsid=Integer.valueOf( request.getParameter("newsid"));
        System.out.println("newsID:"+newsid);
        NewsService service= new NewsService();
        try {
            News news=service.GetNews(newsid);
            request.setAttribute("news", news);
            request.getRequestDispatcher("EditNews.jsp").forward(request,response);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
