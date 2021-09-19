<%-- 
    Document   : CheckBox
    Created on : 11 Sep, 2021, 11:26:34 AM
    Author     : nivas
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@include file="header1.jsp" %>
    <%@include file="Template.jsp" %>
<head>
<meta http-eqUIv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript">
function sample()
{
for(var i=0; i < document.form1.frUIt.length; i++)
{
if(!document.f.car[i].checked)
{
alert("Please Select");
return false;
}
else
{
alert("Click OK to display your choice");
return true;
}
}
}
</script>
<title>Demo</title>
</head>
<body>
    <div align='center'>
    <table style="border-spacing: 15px;  background-color: white; opacity: 0.6"><tr><td>
<form name="f" onsubmit="sample()">
    <h3 style="color: blue">Select your Car Service</h3>
    
        <input type="checkbox" name="car" value="carwash" value="ON"/>car wash<br>
        <input type="checkbox" name="car" value="oil change" value="ON"/>oil change<br>
        <input type="checkbox" name="car" value="Full Services" value="ON" />Full Services<br>
        <input type="checkbox" name="car" value="Wheel Alignment" value="ON" />Wheel Alignment<br>
        <input type="checkbox" name="car" value="A/c Services" value="ON" />A/c Services<br>
        <input type="checkbox" name="car" value="GearBox Services" value="ON" />GearBox Services<br>
        <input type="checkbox" name="car" value="Battery Replacement" value="ON" />Battery Replacement<br>
        <input type="checkbox" name="car" value="Car Suspension" value="ON" />Car Suspension<br>
        <input type="checkbox" name="car" value="Brake Repair" value="ON" />Brake Repair<br>
     Date : <input type="date" name="car" required="">

     <p><input type="submit" value="submit" style="color: white; background-color: blue"/>
</form>
<%
String s[]= request.getParameterValues("car");
if(s != null)
{
%>
<h4 style="color: blue">Service's Selected</h4>
<ul>
<%
for(int i=0; i<s.length; i++)
{
%>
<li><%=s[i]%></li>
<%
}
%>
</ul>
<%
}
%>
<a href="PlaceService.jsp"><input type="submit" value="Place your Service" style="color: white; background-color: blue"/></a>
            </td></tr></table></div>
        </body>
        <%@include file="footer.jsp" %>
</html>
