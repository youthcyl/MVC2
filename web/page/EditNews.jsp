<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2020/6/23
  Time: 16:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Title</title>
</head>
<body>
<form action="SaveNewsServlet"  method="post">
    <div style="height: 30px">
        ID：<input type="text" name="newsid"  value="${news.newsid}"/>
    </div>
    <div style="height: 30px">
        类别：<input type="text" name="category"  value="${news.category}"/>
    </div>
    <div style="height: 30px">
        标题：<input type="text" name="title"  value="${news.title}"/>
    </div>
    <div style="height: 50px">
        内容：<input type="textarea" name="contents" style="height: 30px" value="${news.contents}" />
    </div>
    <div style="height: 30px">
        作者：<input type="text" name="author"  value="${news.author}"/>
    </div>
    <div style="height: 30px">
        时间：<input type="text" name="newsdate"  value="${news.newsdate}"/>
    </div>
    <input type="submit" value="修改"/>
</form>

</body>
</html>
