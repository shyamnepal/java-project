<%-- 
    Document   : select
    Created on : Feb 6, 2020, 1:51:21 PM
    Author     : shyam
--%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="pre" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table border="1px">
            <tr>
                <th>Name</th>
                <th>address</th>
                <th>phone</th>
                <th>email</th>
                <th>username</th>
                <th>password</th>
                <th>gender</th>
                <th>faculty</th>
                <th>Action</th>
                
            </tr>
            <pre:forEach items="${lis}" var="aa">
            <tr>
                <td>${aa.name}</td>
                <td>${aa.address}</td>
                <td>${aa.phone}</td>
                <td>${aa.email}</td>
                <td>${aa.username}</td>
                <td>${aa.password}</td>
                <td>${aa.gender}</td>
                <td>${aa.faculty}</td>
                <td><a href="${pageContext.servletContext.contextPath}/delete?id=${aa.id}">delete</a>||<a href="${pageContext.servletContext.contextPath}/edit?id=${aa.id}">edit</a></td>
            </tr>
            </pre:forEach>
        </table>
        ${msg}
    </body>
</html>
