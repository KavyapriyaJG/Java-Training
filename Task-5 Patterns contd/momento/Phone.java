package momento;

/**
 * Problem: undo operation without breaking encapsulation. 
 * Solution: While adding new States, maintain a list of memento in a caretaker - only accessible to that caretaker. Is not visible to orignator.
 * @author Kavyapriya
 */
public class Phone {
	
	public static void main(String[] args) {
		
		NotesApp app = new NotesApp();
		app.createNote("Note1");
		app.createNote("Note2");
		app.createNote("Note3");		
		app.displayAllNotes();
		
		app.deleteNote();
		app.deleteNote();
		app.deleteNote();
		app.deleteNote();
		
		app.displayAllNotes();
		
	}
}
