<%-- 
    Document   : detail
    Created on : Oct 30, 2021, 4:36:52 PM
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
        <div><b>Entry's Info</b></div>
        <div>EntryID: ${entries.entryId}</div>
        <div>EntryTitle: ${entries.title}</div>
        <div>EntryContent: ${entries.entryContent}</div>
        <div>DateModified: ${entries.dateModified}</div>
        <div><b>Comment of entry</b></div>
        <table>
            <thead>
                <tr>
                    <th>Comment ID</th>
                    <th>Comment Content</th>
                    <th></th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${listComments}" var="comment">
                    <tr>
                        <td>${comment.commentId}</td>
                        <td>${comment.commentContent}</td>
                        <td><a href="delele-comment?commentId=${comment.commentId}&entryId=${entries.entryId}">Delete</a></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>

    </body>
</html>
