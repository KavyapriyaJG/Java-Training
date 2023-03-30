import java.io.FileReader;
import java.io.FileWriter;

public class __7__CopyCharByChar {
	public static void main(String[] args) throws Exception {

		try (FileReader in = new FileReader("details"); FileWriter out = new FileWriter("copy.txt")) {
			char charBuffer[] = new char[8];
			int noOfCharacters = 0;
			while ((noOfCharacters = in.read(charBuffer)) != -1) {
				String s = new String(charBuffer, 0, noOfCharacters);
				out.write(s);
			}
			System.out.println("Copied...");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}