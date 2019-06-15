<%--
  Created by IntelliJ IDEA.
  User: 83415
  Date: 2019/6/15
  Time: 9:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
    <a href="getStu">查询</a>
    <table border="1px" width="200px;">
        <c:forEach var="stu" items="${stuList}">
            <tr>
                <td>${stu.id}</td>
                <td>${stu.name}</td>
            </tr>
        </c:forEach>
    </table>
</center>
</body>
</html>
