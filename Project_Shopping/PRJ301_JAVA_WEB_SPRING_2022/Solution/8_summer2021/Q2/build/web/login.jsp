<%-- 
    Document   : login
    Created on : Oct 30, 2021, 4:09:03 PM
    Author     : win
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="login" method="POST">
            Username:<input type="text" name="username" value="" /><br/>
            Password:<input type="password" name="password" value="" /><br/>
            <h3 style="color: red">${err}</h3>
            <input type="submit" value="Login"/>
        </form>
    </body>
</html>
