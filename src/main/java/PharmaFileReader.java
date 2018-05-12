import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class PharmaFileReader {
   public String[] readFile(String fileName) throws IOException {
	   String s = new String();
		StringBuffer sb = new StringBuffer();
		DBDLLScripts dbDllS = new DBDLLScripts();
		String databaseScriptsHome = dbDllS.getDatabaseScriptsHome("postgre", "pharma");
		if(databaseScriptsHome != null) {
		FileReader fr = new FileReader(new File(databaseScriptsHome+fileName));
		BufferedReader br = new BufferedReader(fr);

		while ((s = br.readLine()) != null) {
			sb.append(s);
		}
		br.close();

		String[] inst = sb.toString().split(";");
		return inst;
		}
		return null;
   }
}
