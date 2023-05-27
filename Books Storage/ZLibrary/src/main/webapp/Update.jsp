<%@page import="java.sql.Statement"%>
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
	
	String price = request.getParameter("price");
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/zlibrary", "root", "Root");
		
		
		PreparedStatement ps = c.prepareStatement("select * from bookslists where id=?");
		ps.setString(1,id);
		
		ResultSet rs = ps.executeQuery();
	
		
		
	while(rs.next()){
		PreparedStatement p2 = c.prepareStatement("update bookslists set price = ? where id=?");
		p2.setString(2,id);
		p2.setString(1,price);
		p2.executeUpdate();
		out.print("<h1>updated</h1>");
		RequestDispatcher rd = request.getRequestDispatcher("UpdateBook.jsp");
		rd.forward(request,response);
		
				
	}
		

	
	
	
	}
	catch(Exception e){
	
	e.printStackTrace();
	}
	
			

	
	
	response.setContentType("text/html");
	out.print("No Book Matches the id");
	RequestDispatcher rs = request.getRequestDispatcher("UpdateBook.jsp");
	rs.include(request, response);
	%>

</body>
</html>