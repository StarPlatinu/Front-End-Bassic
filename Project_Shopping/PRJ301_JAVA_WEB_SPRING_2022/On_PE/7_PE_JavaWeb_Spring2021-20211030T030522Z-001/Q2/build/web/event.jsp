<%-- 
    Document   : event
    Created on : Mar 15, 2022, 11:18:59 PM
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
        <c:forEach items="${listEvents}" var="E">
            <form action="add-record" method="POST">
                <div>+${E.content}</div>
                <c:forEach items="${E.records}" var="R">
                    <div>-${R.content}</div>
                </c:forEach>
                <div>new record for event: 
                    <input type="hidden" name="eid" value="${E.id}"/>
                    <input type="text" name="recordContent" value="" />
                    <input type="submit" value="Submit" /> </div>
            </form>
        </c:forEach>
    </body>
</html>
