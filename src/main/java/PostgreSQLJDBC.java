import java.sql.Connection;
import java.sql.SQLException;

public class PostgreSQLJDBC {
	public static void main(String args[]) {
		Connection conn = null;
		OwnDatasource source = new OwnDatasource("the pharma datasource", "localhost", "pharma", "lappi", "adimida", 15432);
		try {
		    conn = source.getPgds().getConnection();
		    // use connection
		} catch (SQLException e) {
		    // log error
		} finally {
		    if (conn != null) {
		        try { conn.close(); } catch (SQLException e) {}
		    }
		}
		System.out.println("The database oppened successfully");
	}
}