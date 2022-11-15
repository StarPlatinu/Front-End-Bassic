<%-- 
    Document   : event
    Created on : Mar 15, 2022, 10:11:37 PM
    Author     : Le Hong Quan
--%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            table{
                border-collapse: collapse;
            }
        </style>
    </head>
    <body>
        <table border="1">
            <thead>
                <tr>
                    <th>Event ID</th>
                    <th>Content</th>
                    <th>Occur</th>
                    <th>is Enable</th>
                    <th>Owner</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${listEvents}" var="E">
                    <tr>
                        <td>${E.id}</td>
                        <td>${E.content}</td>
                        <td><fmt:formatDate value="${E.date}" pattern="MM/dd/yyyy"/></td>
                        <td><input type="checkbox" ${E.isEnable?"checked":""} /></td>
                        <td>${E.createdBy}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>

    </body>
</html>
