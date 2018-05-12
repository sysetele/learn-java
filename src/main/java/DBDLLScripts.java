import java.nio.file.Files;
import java.nio.file.Paths;

public class DBDLLScripts {
   public static final String DATABASE_SCRIPTS_ROOT_DIR = "/home/sowboy/database/scripts/";
   public String getDatabaseScriptsHome(String engine, String dbName) {
	   String databaseScriptsHome = DATABASE_SCRIPTS_ROOT_DIR+"/"+engine+"/"+dbName+"/";
	   //Return null if the directory not exist
	   if (Files.isDirectory(Paths.get(databaseScriptsHome))) {
		   return databaseScriptsHome;
		 }else {
			 return null;
		 }
	   
   }
}
