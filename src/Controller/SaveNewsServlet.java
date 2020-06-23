package Controller;

import Entity.News;
import Service.NewsService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(name = "SaveNewsServlet")
public class SaveNewsServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");
        News news=new News ();
        news.setNewsid(Integer.valueOf( request.getParameter("newsid")));
        news.setCategory(request.getParameter("category"));
        news.setTitle(request.getParameter("title"));
        news.setAuthor(request.getParameter("author"));
        String newsDate=request.getParameter("newsdate");
        SimpleDateFormat sDateFormat=new SimpleDateFormat("yyyy-MM-dd"); //加上时间
        Date date= null;
        try {
            date = sDateFormat.parse(newsDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        news.setNewsdate(date);
        news.setContents(request.getParameter("contents"));
        NewsService service=new NewsService();
        System.out.println(service.UpdateNews(news));
        request.getRequestDispatcher("ShowNewsListServlet").forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }
}
