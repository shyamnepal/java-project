<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
    </head>

    <body>
        <form action="${pageContext.servletContext.contextPath}/register" method="post">
            <table>
                <tr>
                    <td><label>Name:</label></td>
                    <td> <input type="text" name="name"> </td>
                </tr>
                <tr>
                    <td><label>address:</label></td>
                    <td> <input type="text" name="address"> </td>
                </tr>
                <tr>
                    <td><label>phone:</label></td>
                    <td> <input type="number" name="phone"> </td>
                </tr>
                <tr>
                    <td><label>email:</label></td>
                    <td> <input type="text" name="email"> </td>
                </tr>
                <tr>
                    <td><label>userName:</label></td>
                    <td> <input type="text" name="username"> </td>
                </tr>
                <tr>
                    <td><label>password:</label></td>
                    <td> <input type="password" name="password"> </td>
                </tr>
                <tr>
                    <td><label>Gender:</label></td>
                    <td> <input type="radio" name="gender" value="male">male </td>
                    <td><input type="radio" name="gender" value="female">female</td>
                </tr>
                <tr>
                    <td><label>faculty</label></td>
                    <td><select name="faculty">
                <option></option>
                <option>Management</option>
                <option>science</option>
                <option>Humanities</option>
                </td> 
            </select>
                </tr>
                <tr>
                    <td><input type="submit" value="register"></td>
                </tr>
                
            </table>
        </form>
            ${param.msg}
            
            <hr>
            <a href="${pageContext.servletContext.contextPath}/list">get all data</a>
    </body>
</html>
