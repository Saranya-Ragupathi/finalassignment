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
					Statement stmt =connection.createStatement();
					
					String createTable="create table if not exists candidate (id int primary key auto_increment,name varchar(50),age int)";
					stmt.executeUpdate(createTable);
					
					String insertRecord="insert into candidate (name,age)values('narendar',27)";
					stmt.executeUpdate(insertRecord);
					
					String query="select * from candidate";
					ResultSet resultset=stmt.executeQuery(query);
					System.out.println("ID"+"  "+"NAME"+"  "+"  "+"AGE");
					while(resultset.next()) {
                     int id= resultset.getInt("id");
                     String name=resultset.getString("name");
                     int age=resultset.getInt("age");
                     System.out.println(id+"   "+name+"  "+"  "+age);
					}
					resultset.close();
					
					String updateRecord="update candidate set age=18 where id=2";
					stmt.executeUpdate(updateRecord);
					
					String deleteRecord="delete from candidate where id=5";
					stmt.executeUpdate(deleteRecord);
					
					stmt.close();
					connection.close();
					
				}catch(SQLException e) {
					e.printStackTrace();
				}

	}

}
