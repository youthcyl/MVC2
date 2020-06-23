<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2020/6/23
  Time: 15:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="SaveNewsServlet"  method="post">
    新闻ID<input type="text" name="NewsID" value="${news.newsid}"/>
    新闻标题<input type="text" name="Title" value="${news.title}"/>
    新闻内容<input type="text" name="Contents" value="${news.contents}"/>
    作者<input type="text" name="Author" value="${news.author}"/>
    时间<input type="text" name="NewsDate" value="${news.newsdate}"/>
    <input type="submit" value="更新"/>
</form>
</body>
</html>
