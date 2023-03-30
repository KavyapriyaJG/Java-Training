import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class __9__SerializeAndDeserialize {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		//Writing date object to file
		try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("dateStore.txt"))) {
			Date date = new Date();
			outputStream.writeObject(date);

		} catch (Exception e) {
			System.out.println(e);
		}

		//Reading object from file, casting to date
		try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("dateStore.txt"))) {
			Date date = (Date) inputStream.readObject();
			System.out.println(date);

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}