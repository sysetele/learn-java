import java.io.IOException;

public class TestMyJob {

	public static void main(String[] args) throws IOException {
		PharmaFileReader test = new PharmaFileReader();
		System.out.println(test.readFile("mySQLFile.sql"));
	}

}
