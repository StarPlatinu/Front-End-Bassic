<%-- 
    Document   : entry
    Created on : Oct 30, 2021, 4:24:30 PM
    Author     : win
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
        <table>
            <thead>
                <tr>
                    <th>Entry ID</th>
                    <th>Entry Title</th>
                    <th>Go Detail</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${listEntries}" var="entry">
                    <tr>
                        <td>${entry.entryId}</td>
                        <td>${entry.title}</td>
                        <td><a href="detail?ID=${entry.entryId}">Detail</a></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>

    </body>
</html>
