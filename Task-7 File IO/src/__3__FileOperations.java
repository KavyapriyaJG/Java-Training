import java.util.Scanner;
import java.io.File;

class FileOperations {
	Operations operation;
	public Operations getAction() {
		return operation;
	}
}

abstract class Operations{
	public abstract void operate(File file);
}

class DeleteAFile extends Operations{
	public void operate(File file) {
		if(file.exists()){
			file.delete();
			System.out.println("File deleted successfully..");	
		}else{
			System.out.println("File not found...");
		}
	}
}

class RenameAFile extends Operations{
	public void operate(File file) {
		if(file.exists()){
			Scanner scanner  = new Scanner(System.in);
			System.out.print("Enter the new name for your file -  ");
			String name = scanner.nextLine();
			scanner.close();
			if(file.renameTo(new File(name))){
				System.out.println("File renamed to "+name+" successfully..");	
			}else {
				System.out.println("Error occured..");
			}
		}else{
			System.out.println("File not found...");
		}
	}
}

class SizeOfFile extends Operations{
	public void operate(File file) {
		if(file.exists()){
			System.out.println("Size of file : "+ file.length());
		}else{
			System.out.println("File not found...");
		}
	}
}

public class __3__FileOperations {
	public static void main(String[] args) throws Exception {
		File file = new File("file5");
		
		FileOperations fop = new FileOperations();
		fop.operation = (Operations) Class.forName("RenameAFile").newInstance();
		fop.getAction().operate(file);
		
	}
	
}
