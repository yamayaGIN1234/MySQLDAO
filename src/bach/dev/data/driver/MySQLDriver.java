package bach.dev.data.driver;

import java.sql.Connection;
import java.sql.DriverManager;

import static bach.dev.util.Constants.*;

public class MySQLDriver {
	private static MySQLDriver instance;

	private MySQLDriver() {

	}
	public static MySQLDriver getInstance() {
		if (instance == null) instance = new MySQLDriver();
		return instance;
	}
	public Connection getConnection() {
		
	    Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
		} catch (Exception e) {
			e.printStackTrace();
	    }
		return conn;
	}
}
