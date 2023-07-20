package in.ineuron.jdbc;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.io.*;
import java.sql.SQLException;

		public class DataBaseConnection {

			public static void main(String[] args) {
           
				String url="jdbc:mysql:///spring";
				String username="Rahul";
				String password="Rahul@123";
				
				try {
					Connection connection=DriverManager.getConnection(url,username,password);
					
					String insert="insert into candidate(name,age)values(?,?)";
					PreparedStatement pstmt=connection.prepareStatement(insert);
					
					String filename="src/in/ineuron/jdbc/data.txt";
					BufferedReader br=new BufferedReader(new FileReader(filename));
					String line;
					while((line=br.readLine())!=null) {
						String[] data=line.split(",");
						String name=data[0];
						int age=Integer.parseInt(data[1]);
						
						pstmt.setString(1, name);
						pstmt.setInt(2, age);
						
						pstmt.addBatch();
					}
					br.close();
					
					int[] updateCounts=pstmt.executeBatch();
					
					for(int count :updateCounts) {
						System.out.println("Rows Afffected: "+count);
					}
					pstmt.close();
					connection.close();
					
				}catch(SQLException e) {
					e.printStackTrace();
				}catch(Exception e) {
					e.printStackTrace();
				}

	}

}
