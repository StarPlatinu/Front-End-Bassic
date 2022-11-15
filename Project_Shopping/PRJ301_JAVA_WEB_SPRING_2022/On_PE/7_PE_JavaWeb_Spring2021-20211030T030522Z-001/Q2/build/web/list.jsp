<%-- 
    Document   : list
    Created on : Mar 15, 2022, 11:00:42 PM
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
        <h3>accountid: ${sessionScope.account.accountId}</h3>
        <table border="1">
            <thead>
                <tr>
                    <th>id</th>
                    <th>content</th>
                    <th>date</th>
                    <th>create_by</th>
                </tr>
            </thead>
            <tbody>
            <c:forEach items="${listEventEnable}" var="E">
                    <tr>
                        <td>${E.id}</td>
                        <td>${E.content}</td>
                        <td><fmt:formatDate value="${E.date}" pattern="MM/dd/yyyy"/></td>
                        <td>${E.createdBy}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>
