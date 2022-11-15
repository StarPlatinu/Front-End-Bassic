<%-- 
    Document   : search
    Created on : Mar 15, 2022, 9:38:52 PM
    Author     : Le Hong Quan
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="search" method="POST">
            Name<input type="text" name="name" value="" />
            <input type="submit" value="Search" />
        </form>
        <c:if test="${listEmployees != null && listEmployees.size() > 0}">
            <table border="1">
                <thead>
                    <tr>
                        <th>id</th>
                        <th>name</th>
                        <th>dob</th>
                        <th>gender</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${listEmployees}" var="E">
                        <tr>
                            <td>${E.id}</td>
                            <td>${E.name}</td>
                            <td>${E.dob}</td>
                            <td>${E.gender}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </c:if>

    </body>
</html>
