<%-- 
    Document   : edit
    Created on : Feb 6, 2020, 11:53:13 PM
    Author     : shyam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="pre" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
       
        <form method="post" action="${pageContext.servletContext.contextPath}/update?id=${st.id}">
            <table>
                
                <tr>
                    <td><label>Name:</label></td>
                    <td> <input type="text" name="name" value="${st.name}"> </td>
                </tr>
                <tr>
                    <td><label>address:</label></td>
                    <td> <input type="text" name="address" value="${st.address}"> </td>
                </tr>
                <tr>
                    <td><label>phone:</label></td>
                    <td> <input type="number" name="phone" value="${st.phone}"> </td>
                </tr>
                <tr>
                    <td><label>email:</label></td>
                    <td> <input type="text" name="email" value="${st.email}"> </td>
                </tr>
                <tr>
                    <td><label>userName:</label></td>
                    <td> <input type="text" name="username" value="${st.username}"> </td>
                </tr>
                <tr>
                    <td><label>password:</label></td>
                    <td> <input type="text" name="password" value="${st.password}"> </td>
                </tr>
                <tr>
                    <td><label>Gender:</label></td>
                    <td> <input type="radio" name="gender" value="male" ${st.gender.equals("male")?"checked":""}>male </td>
                    <td><input type="radio" name="gender" value="female" ${st.gender.equals("female")?"checked":""}>female</td>
                </tr>
                <tr>
                    <td><label>faculty</label></td>
                    <td><select name="faculty">
                <option></option>
                <option value="management" ${st.faculty.equals("management")?"selected":""}>Management</option>
                <option value="science" ${st.faculty.equals("science")?"selected":""}>science</option>
                <option value="humanities" ${st.faculty.equals("humanities")?"selected":""}>Humanities</option>
                </td> 
            </select>
                </tr>
                <tr>
                    <td><input type="submit" value="update"></td>
                </tr>
                 
            </table>
        </form>
       
    </body>
</html>
