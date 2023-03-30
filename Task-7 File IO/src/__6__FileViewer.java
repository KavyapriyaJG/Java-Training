import java.io.FileInputStream;

public class __6__FileViewer {
	public static void main(String[] args) throws Exception{
	
		try(FileInputStream fis=new FileInputStream("details")){
			int letter;
			while((letter = fis.read())!=-1)
				System.out.print((char)letter);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
