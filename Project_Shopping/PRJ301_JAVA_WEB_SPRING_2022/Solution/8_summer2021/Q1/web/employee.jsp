<%-- 
    Document   : employee
    Created on : Oct 30, 2021, 3:32:16 PM
    Author     : win
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="employees" method="POST">
            Name <input type="text" name="name" value="" /> <br/>
            Sex 
            <input type="radio" name="gender" value="true" checked="checked" />Male 
            <input type="radio" name="gender" value="false" />Female <br/>
            <input type="submit" value="Submit"/>
        </form>
        <c:choose>
            <c:when test="${listEmployees.size()==0}">
                <div>There are no employees on the list yet</div>
            </c:when>
            <c:otherwise>
                <div>List employees:</div>
                <c:forEach items="${listEmployees}" var="employee">
                    <div>${employee.name}-${employee.gender?"Male":"Female"}</div>
                </c:forEach>
            </c:otherwise>
        </c:choose>


    </body>
</html>
