import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class __5__ImageByteByByteCopy {
	public static void main(String[] args) {
		try (FileInputStream fileInputStream = new FileInputStream("siriusStar.jpeg");
				FileOutputStream fileOutputStream = new FileOutputStream("siriusStar1.jpeg", true);) {
			int n = 0;

			byte imageBytes[] = new byte[1024];
			
			while((n = fileInputStream.read(imageBytes)) != -1) {
				fileOutputStream.write(imageBytes, 0, n);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
