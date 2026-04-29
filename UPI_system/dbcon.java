package UPI_system;

import java.sql.Connection;
import java.sql.DriverManager;

public class dbcon {

	public static Connection getMyDbConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/upi_db?createDatabaseIfNotExist=true";
			String user = "root";
			String pass = "Karansri@6423";
			Connection con = DriverManager.getConnection(url, user, pass);
			return con;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
