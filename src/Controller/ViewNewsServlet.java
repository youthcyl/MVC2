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

@WebServlet(name = "ViewNewsServlet")
public class ViewNewsServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

        response.setContentType(("text/html;charset=UTF-8"));
        request.setCharacterEncoding("UTF-8");
        int id = Integer.parseInt(request.getParameter("newsid"));
        System.out.println(id);
        NewsService service = new NewsService();
        try
        {
            News news = service.GetNews(id);
            request.setAttribute("news",news);
            request.getRequestDispatcher("ViewNews.jsp").forward(request,response);
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }

    }
}
