package momento;

public class UserInterface {
	
	public static void main(String[] args) {
		
		NotesApp app = new NotesApp();
		app.createNote("Note1");
		app.createNote("Note2");
		app.createNote("Note3");
		
		app.deleteNote();
		
		app.displayAllNotes();
		
	}
}
