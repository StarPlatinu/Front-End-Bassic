<%-- 
    Document   : createStudent
    Created on : Feb 8, 2022, 8:55:43 PM
    Author     : Le Hong Quan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="create-student" method="POST">
            <table>
                <tr>
                    <td>name</td>
                    <td><input type="text" name="name" value="" /></td>
                </tr>
                <tr>
                    <td>age</td>
                    <td><input type="text" name="age" value="" /></td>
                </tr>
                <tr>
                    <td>mark</td>
                    <td><input type="text" name="mark" value="" /></td>
                </tr>
                <tr>
                    <td>class id</td>
                    <td><input type="text" name="classId" value="" /></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Save"/></td>
                </tr>
            </table>

        </form>
    </body>
</html>
