<%-- 
    Document   : search
    Created on : Oct 21, 2019, 6:02:04 PM
    Author     : sonnt
--%>

<%@page import="model.Employee"%>
<%@page import="model.Department"%>
<%@page import="java.util.ArrayList"%>
<%@page isELIgnored="false" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

    </head>
    <body>
        <form action="search" method="post">
            ID: <input type="text" name="id" value="${requestScope.id}"/> <br/>
            Name: <input type="text" name="name" value="${requestScope.name}"/> <br/>
            Gender 
            <input type="radio" ${(requestScope.gender eq "male")?"checked=\"checked\"":""} name="gender" value="male"/> Male 
            <input type="radio" ${(requestScope.gender eq "female")?"checked=\"checked\"":""} name="gender" value="female"/> Female 
            <input type="radio" ${(requestScope.gender eq "both")?"checked=\"checked\"":""} name="gender" value="both"/> Both 
            <br/>
            Department: 
            <select name="did"> 
                <option value="0">Choose a department</option>
                <c:forEach items="${requestScope.depts}" var="d">
                    <option ${(d.id == requestScope.did)?"selected=\"selected\"":"" } value="${d.id}">${d.name}</option>
                </c:forEach>

            </select>
            <br/>
            Dob From <input type="date" name="from" value="${requestScope.from}"/> <br/>
            Dob To <input type="date" name="to" value="${requestScope.to}"/> <br/>
            <input type="submit" value="Search"/>
        </form>    
        <table border="1px">
            <tr>
                <th>Id</th>
                <th>Name</th>
                <th>Gender</th>
                <th>Dob</th>
                <th>Department</th>
            </tr>
            <c:forEach items="${requestScope.emps}" var="e" varStatus="loop" >
                <tr ${loop.index mod 2 == 0?"style=\"background-color: gray;\"":""} >
                    <td>${e.id}</td>
                    <td>${e.name}</td>
                    <td>${e.gender}</td>
                    <td><fmt:formatDate type = "date" 
                                    value = "${e.dob}" /></td>
                    <td>${e.dept.name}</td>
                </tr>
            </c:forEach>
        </table>    

    </body>
</html>
