package in.ineuron.controller;
import java.io.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test")
public class Databaseconnection extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		String url="jdbc:mysql:///spring";
		String username="Rahul";
		String password="Rahul@123";
		
		PrintWriter out=response.getWriter();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection(url,username,password);
			
			String query="select * from candidate";
			Statement statement=connection.createStatement();
			ResultSet resultset=statement.executeQuery(query);

            out.print("<html>");
            out.print("<head><title>CANDIDATES</title></head>");
            out.print("<center>");
            out.print("<h1>CANDIDATES</h1>");
            out.print("<body>");
            out.print("<table border='1'>");
            out.print("<tr><th>ID</th><th>NAME</th><th>AGE</th></tr>");
			while(resultset.next()) {
             int id= resultset.getInt("id");
             String name=resultset.getString("name");
             int age=resultset.getInt("age");
             out.print("<tr><td>"+id+"</td>"+"<td>"+name+"</td>"+"<td>"+age+"</td></tr>");
			}

	            out.print("</table>");
	            out.print("</body></center></html>");
	            
	            resultset.close();
	            statement.close();
	            connection.close();
	            
			
	}catch(SQLException | ClassNotFoundException e) {
		e.printStackTrace();
	}
}
}
