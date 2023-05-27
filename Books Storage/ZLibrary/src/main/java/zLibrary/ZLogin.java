package zLibrary;

import java.io.*;
import java.sql.*;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/ZLogin")
public class ZLogin extends GenericServlet
{
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		
		String name = req.getParameter("lname");
		
		String pass = req.getParameter("lpass");
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/zlibrary","root","Root");
			PreparedStatement ps = con.prepareStatement("select * from users where name=? and Password=?");
			
			ps.setString(1,name);
			ps.setString(2,pass);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
//				res.setContentType("text/html");
				RequestDispatcher rd = req.getRequestDispatcher("Home.jsp");
				rd.forward(req, res);
			}
		}
		catch (Exception e)
		{	
			e.printStackTrace();
		}
		
		
		
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		pw.print("Incorrect Username or Password");
		RequestDispatcher rs = req.getRequestDispatcher("ZLogin.html");
		rs.include(req, res);
		
	}
}
