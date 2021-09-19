<%-- 
    Document   : adminregistration
    Created on : 15 Sep, 2021, 3:04:14 PM
    Author     : nivas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div align="center">
        <form action="admindao" method="post">
            <table style="border: solid black; border-spacing: 18px; width: 23%; opacity: 1; background-color: wheat">
                <tr><td>
                        <h1 style="color: red">Registration</h1>
                        user Name:<br><input type="text" name="username" value="" requrid="" autofocus=""/><br><br/>
                      
                        E-Mail:<br/><input type="text" name="email" value="" required="" /><br/><br/>
                      
                        Password:<br><input type="password" name="npass" value=""required=""/><br><br>
                        
                        Retype Password:<br><input type="password" name="rpass" value="" required=""/><br><br>
                        
                        Designation:<br><input type="text" name="desig" value="" /><br><br>
                        
                        phone:<br><input type="text" name="phone" value=""/><br><br>
                        
                        <input type="submit" value="submit" />&nbsp;&nbsp;
                        <input type="reset" value="Reset" /><br><br>
                        <a href="admin.jsp" style="colour: red"> Go Back To Login Page</a>
                    </td></tr>
            </table>
        </form>
        </div>
    </body>
</html>
