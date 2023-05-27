package zLibrary;

import java.io.*;
import java.sql.*;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/ZRegister")

public class ZRegister extends GenericServlet
{
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		String name = req.getParameter("myname");
		
		String email  = req.getParameter("email");
		
		String phone = req.getParameter("phone");
		
		String pass = req.getParameter("pass");
		
		
		// Store data into database
		
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/zlibrary","root","Root");
			PreparedStatement pe = con.prepareStatement("insert into users values(? ,?, ?, ?)");
			pe.setString(1,name);
			pe.setString(2,email);
			pe.setString(3,phone);
			pe.setString(4,pass);
			
			pe.executeUpdate();
		} 
		
		catch (Exception e)
		{	
			e.printStackTrace();
		}
		
//		PrintWriter pw = res.getWriter();
		
		res.setContentType("text/html");
		RequestDispatcher rs = req.getRequestDispatcher("ZLogin.html");
		rs.forward(req, res);
		
	}
}
