package in.ineuron.jdbc;
		import java.sql.Connection;
		import java.sql.DriverManager;
		import java.sql.ResultSet;
		import java.sql.SQLException;
		import java.sql.Statement;

		public class DataBaseConnection {

			public static void main(String[] args) {
           
				String url="jdbc:mysql:///spring";
				String username="Rahul";
				String password="Rahul@123";
				
				try {
					Connection connection=DriverManager.getConnection(url,username,password);
					
					String query="select * from customer";
					Statement statement=connection.createStatement();
					ResultSet resultset=statement.executeQuery(query);
					System.out.println("ID"+"  "+"FIRSTNAME"+"  "+"LASTNAME"+"   "+"EMAIL");
					while(resultset.next()) {
                     int id= resultset.getInt("id");
                     String firstname=resultset.getString("firstname");
                     String lastname=resultset.getString("lastname");
                     String email=resultset.getString("email");
                     System.out.println(id+"   "+firstname+"  "+lastname+"  "+email);
					}
					
					resultset.close();
					statement.close();
					connection.close();
					
				}catch(SQLException e) {
					e.printStackTrace();
				}

	}

}
