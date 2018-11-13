<%@page import="com.slk.training.dao.ProductDaoImpl"%>
<%@page import="com.slk.training.model.loginBean"%>
<%@page import="com.slk.training.model.*" %>
<%@page import="com.slk.training.demo.*" %>
<%@page import="java.util.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="menu.html" %>
<%loginBean lb= (loginBean)session.getAttribute("sname");
String name=lb.getName();
%>
<h1 align="right">Logged in as <%= name %></h1>
<table border="1">
<tr>
<th>PID</th>
<th>PNAME</th>
<th>PCOST</th>
<th>Pquant</th>
</tr>

<%
ProductDaoImpl pdao=new ProductDaoImpl();
List<productBean>  products=pdao.getAllProducts();
for(productBean pb:products){
	%>
	<tr>
		<td><%= pb.getPid() %></td>
		<td><%= pb.getPname() %></td>
		<td><%= pb.getPcost() %></td>
		<td><%= pb.getPquantity() %></td>
	</tr>
	<%
}
%>
</table>

</body>
</html>