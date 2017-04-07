<%--
  Created by IntelliJ IDEA.
  User: vasya
  Date: 05.04.2017
  Time: 17:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Создание нового диска</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
<form action="${pageContext.servletContext.contextPath}/disk/create" method="POST">
    <div>
        <div>
            <div align="right" >Название DVD диска : </div>
            <div>
                <input type="text" name="diskname">
            </div>
        </div>
        <div>
            <td><input type="submit" align="center" value="Создать"/></td>
        </div>
    </div>
</form>
<div>
    <div>
        <div>Id Name</div>
    </div>
    <c:forEach var="movie" items="${disks}" >
    <div> <div>${movie.id} ${movie.name}</div> </div>
    </c:forEach>
</div>
</body>
</html>
