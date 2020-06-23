<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2020/6/23
  Time: 18:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
    <title>Title</title>
</head>
<body>
新闻ID：${news.newsid}<br/>
新闻类别：${news.category}<br/>
新闻标题：${news.title}<br/>
新闻内容：${news.contents}<br/>
作者：${news.author}<br/>
时间：${news.newsdate}<br/>
</body>
</html>
