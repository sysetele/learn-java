import org.postgresql.ds.PGPoolingDataSource;

public class OwnDatasource {
	private String dataSourceName = "";
	private String serverName = "";
	private String databaseName = "";
	private String user ="";
	private String password = "";
	private int portNumber;
	private PGPoolingDataSource pgds;
	
	    @SuppressWarnings("deprecation")
		public OwnDatasource(String dataSourceName, String serverName, String databaseName, String user, String password, int portNumber) {
		this.pgds = new PGPoolingDataSource();
		this.pgds.setDataSourceName(dataSourceName);
		this.pgds.setServerName(serverName);
		this.pgds.setDatabaseName(databaseName);
		this.pgds.setUser(user);
		this.pgds.setPassword(password);
		this.pgds.setPortNumber(portNumber);
	}

		public PGPoolingDataSource getPgds() {
			return pgds;
		}

		public void setPgds(PGPoolingDataSource pgds) {
			this.pgds = pgds;
		}

	     
}
