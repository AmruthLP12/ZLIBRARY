<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
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
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/zlibrary", "root", "Root");
		
		PreparedStatement ps = c.prepareStatement("select * from bookslists where id=?");
		
		ps.setString(1,id);
		
		ResultSet rs = ps.executeQuery();
	
		
		
	while(rs.next())
	{
		PreparedStatement p2 = c.prepareStatement("delete from bookslists where id=?");
		p2.setString(1,id);
		p2.executeUpdate();
		out.print("<h1>deleted</h1>");
		RequestDispatcher rd = request.getRequestDispatcher("DeleteBook.jsp");
		rd.forward(request,response);
		
				
	}
			
	}
	
	catch (Exception e)
	{	
		e.printStackTrace();
	}
	
	
	response.setContentType("text/html");
	RequestDispatcher rs = request.getRequestDispatcher("DeleteBook.jsp");
	rs.include(request, response);
	out.print("No Book Matches the id");
	%>

</body>
</html>