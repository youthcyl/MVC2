package Service;
import DAL.SqlHelper;
import Entity.News;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class NewsService {
    public boolean AddNews(News news){
        String sql="Insert into tb_News (category,title,contents,author,newsdate) "
                +"values ('" + news.getCategory() +"','"
                + news.getTitle() +"','"
                + news.getContents() +"','"
                + news.getAuthor() +"','"
                + String.valueOf(news.getNewsdate()) +"');";
                System.out.println(sql);
           return SqlHelper.executeUpdate(sql);

    }

    public boolean DeleteNews(int newsid){
        String sql="Delete from tb_News where newsid="+newsid;
        System.out.println(sql);
        boolean result= SqlHelper.executeUpdate(sql);
        return result;
    }

    public boolean UpdateNews(News news ){
        String sql="Update tb_News set category ='" + news.getCategory() + "' ,title = '"
                + news.getTitle() + "',contents = '"
                + news.getContents() + "',author = '"
                + news.getAuthor() + "' where newsid = " + news.getNewsid()+"";
        System.out.println(sql);
        boolean result= SqlHelper.executeUpdate(sql);
        return result;
    }

    public List<News> QueryNews() throws SQLException {
        String sql="Select * from tb_News";
        ResultSet rs;
        rs= SqlHelper.executeQuery(sql);
        List<News> listNews=new ArrayList<News>();
        while (rs.next()){
            News news = new News();
            news.setNewsid(rs.getInt("newsid"));
            news.setCategory(rs.getString("category"));
            news.setTitle(rs.getString("title"));
            news.setContents(rs.getString("contents"));
            news.setAuthor(rs.getString("author"));
            news.setNewsdate(rs.getDate("newsdate"));
            listNews.add(news);
        }
        return listNews;
    }

    public News GetNews(int newsid) throws SQLException {
        String sql="Select * from tb_News where newsid="+newsid;
        ResultSet rs;
        rs= SqlHelper.executeQuery(sql);
        News  news=new News();
        if (rs.next()){
            news.setNewsid(rs.getInt("newsid"));
            news.setCategory(rs.getString("category"));
            news.setTitle(rs.getString("title"));
            news.setContents(rs.getString("contents"));
            news.setAuthor(rs.getString("author"));
            news.setNewsdate(rs.getDate("newsdate"));
        }
        return news;

    }
}
