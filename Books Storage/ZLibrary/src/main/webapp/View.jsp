<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.PreparedStatement"%>
<%@page import="com.mysql.cj.xdevapi.PreparableStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.net.ConnectException"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Page</title>
<link rel="stylesheet" href="view.css">
</head>
<body style=background-image: url(Books/frame-3355028_1920.jpg);>

	<%
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/zlibrary", "root", "Root");
		Statement st = c.createStatement();
		
		ResultSet rs = st.executeQuery("Select * from bookslists");
		
		out.print("<table class='view'>");
		out.print("<tr style='background-color: blue; color: black; height: 40px;'>");
		out.print("<th>Id</th>");
		out.print("<th>title</th>");
		out.print("<th>author</th>");
		out.print("<th>price</th>");
		out.print("</tr>");
		while(rs.next()){
			String id=rs.getString(1);
			String title=rs.getString(2);
			String author=rs.getString(3);
			String price=rs.getString(4);
			out.print("<tr>");
			out.print("<td>"+id+"</td>");
			out.print("<td>"+title+"</td>");
			out.print("<td>"+author+"</td>");
			out.print("<td>"+price+"</td>");
			out.print("</tr>");
		}
		out.print("</table>");
		out.print("<a href='Home.jsp'>Home</a>");
	}
	
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
	
	
	
	
	%>
	


</body>
</html>

















