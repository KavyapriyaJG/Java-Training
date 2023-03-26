import java.io.File;

public class __4__ListContents {
	public static void main(String[] args) {
		
		File path = new File(System.getProperty("user.dir")+"/src");
		
		System.out.println("No of files and directories in this path are : "+path.list().length+"\n");
		
		for(int i=0;i<path.list().length; i++) {
			System.out.println((i+1)+". "+path.list()[i]);
		}
		
	}
}
