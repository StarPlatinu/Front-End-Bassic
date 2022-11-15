<%-- 
    Document   : createStudent
    Created on : Feb 8, 2022, 8:55:43 PM
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
        <form action="update-student" method="POST">
            <table>
                <input type="hidden" name="id" value="${student.id}" /></td>
                <tr>
                    <td>name</td>
                    <td><input type="text" name="name" value="${student.name}" /></td>
                </tr>
                <tr>
                    <td>age</td>
                    <td><input type="text" name="age" value="${student.age}" /></td>
                </tr>
                <tr>
                    <td>mark</td>
                    <td><input type="text" name="mark" value="${student.mark}" /></td>
                </tr>
                <tr>
                    <td>class id</td>
                    <td>
                        <select name="classId">
                            <c:forEach items="${listClasses}" var="C">
                                <option ${C.classId == student.classId ?"selected":""} value="${C.classId}">${C.className}</option>
                            </c:forEach>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Save"/></td>
                </tr>
            </table>

        </form>
    </body>
</html>
