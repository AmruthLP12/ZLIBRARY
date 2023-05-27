<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.mysql.cj.xdevapi.PreparableStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.net.ConnectException"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	
	String id = request.getParameter("id");
	String title = request.getParameter("title");
	String author = request.getParameter("author");
	String price = request.getParameter("price");
	
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/zlibrary", "root", "Root");
		PreparedStatement ps = c.prepareStatement("insert into bookslists values(?,?,?,?)");
		
		ps.setString(1, id);
		ps.setString(2, title);
		ps.setString(3, author);
		ps.setString(4, price);
		
		ps.executeUpdate();
	}
	
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
	//response.setContentType("text/html");
	
	RequestDispatcher rs = request.getRequestDispatcher("AddBook.jsp");
	rs.forward(request, response);
	out.print("Book Added Successfully");
	
	
	
	
	
	%>
</body>
</html>