<%-- 
    Document   : index
    Created on : Aug 21, 2018, 3:33:34 PM
    Author     : DeltaDivine
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Form</title>
    </head>
    <body>
        <h1>Login Authentication</h1>
        <form action="Login" method="POST">
            Username: <input type="text" name="username"/><br>
            Password: <input type="password" name="password"/><br>
            <input type="submit" value="Submit"/>
            <input type="reset" value="reset"/>
        </form>
    </body>
</html>
