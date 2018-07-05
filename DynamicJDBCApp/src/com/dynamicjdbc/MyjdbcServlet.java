package com.dynamicjdbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyjdbcServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		/*Driver d=new Driver();
		DriverManager.registerDriver(d);
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tyss?user=root&password=root");
		Statement s=con.createStatement();
		ResultSet res=s.executeQuery("select * from student_info");
		while(res.next())
		{
			 System.out.println(res.getInt(1)+"\t"+res.getString(2)+"\t"+res.getString(3)+"\t"+res.getString(4));
		}
		con.close();*/
		out.println(
				 "<html>"
				+"<title>mypage</title>"
				+"<body>"
				+"<h1> welcome to dynamic jdbc project, current data is "+new Date()+"</h1>"
				+"</body>"
				+"</html>");
	}
}
