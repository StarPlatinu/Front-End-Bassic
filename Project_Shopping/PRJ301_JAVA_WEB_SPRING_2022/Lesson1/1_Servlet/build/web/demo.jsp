<%-- 
    Document   : demo
    Created on : Jan 18, 2022, 9:12:00 PM
    Author     : Le Hong Quan
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            .page{
                background-color: lightblue;
                padding: 5px 10px;
            }
            .page+.page{
                margin-left: 10px;
            }
        </style>
    </head>
    <body>
        <h1>Hello World!</h1>
        <h3>Đây là thẻ h3</h3>
        <div>
            <c:forEach items="${list}" var="elem">
                <span class="page">
                    ${elem}
                </span>
            </c:forEach>


        </div>

    </body>
</html>
