import java.sql.Connection;
import java.sql.SQLException;

public class PharmaDBConnection {
	private static OwnDatasource source = new OwnDatasource("the pharma datasource", "localhost", "pharma", "lappi", "adimida", 15432);
	private static Connection conn = null;
	
	public static Connection getConnection() {
		try {
		     if ( (conn == null) || conn.isClosed()) {
			conn = source.getPgds().getConnection();
		     }
		    // use connection
		} catch (SQLException e) {
		    e.printStackTrace();
		} 
		return conn;
	}
}