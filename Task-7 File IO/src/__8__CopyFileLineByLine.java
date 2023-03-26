import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.IOException;

public class __8__CopyFileLineByLine {
	public static void main(String[] args) throws IOException, FileNotFoundException {

		BufferedReader inputStream = null;
		PrintWriter outputStream = null;

		try {
			inputStream = new BufferedReader(new FileReader("details"));
			outputStream = new PrintWriter(new FileWriter("lineByLineCopy.txt"));

			String line;
			while ((line = inputStream.readLine()) != null) {
				outputStream.println(line);
			}
			System.out.println("Copied line by line ...");
		} finally {
			if (inputStream != null) {
				inputStream.close();
			}
			if (outputStream != null) {
				outputStream.close();
			}
		}
	}
}