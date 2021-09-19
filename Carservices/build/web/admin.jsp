<%-- 
    Document   : admin
    Created on : 15 Sep, 2021, 10:59:46 AM
    Author     : nivas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@include file="header1.jsp" %>
    <%@include file="Template.jsp" %>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>    
        <form action="logindao" method="POST">
            <table style="border: solid white; border-spacing: 15px;  background-color: white; opacity: 0.5">
                <tr><td> 
                        <h1>Admin Login</h1>
       <div align="Center"> 
           <input type="text" name="user" value="" autofocus="" required="" placeholder="username"/><br/><br/>
           <input type="password" name="pass" value="" required="" placeholder="password"/><br/><br/>
       </div>
                        <div align="center">              
                        
            <input type="submit" value="submit" style="color: white; background-color: black; border-radius: 4px"/>
                        </div>                           
            
                    </td></tr>   </table>
       
        </form>
    </center>
    </body>
    <br><br><br>
    <%@include file="footer.jsp" %>
</html>

