package momento;
import java.util.Stack;

/**
 * Notes App that creates notes, deletes notes, displays notes and stores them
 * @author Kavyapriya
 */
public class NotesApp {
	private Stack<Memento> notesApp = new Stack<>();

	/**
	 * Gets all notes
	 * @return memento of notes
	 */
	public Stack<Memento> getAllNotes() {
		return this.notesApp;
	}

	/**
	 * Creates a new note
	 * @param noteContent Text content of a note
	 */
	public void createNote(String noteContent) {
		(this.notesApp).push(new Memento().setMemento(noteContent));
	}

	/**
	 * Deletes the latest note
	 * @return The deleted note
	 */
	public Memento deleteNote() {
		if(this.notesApp.size()>0) {
			Memento lastNote = (this.notesApp).get((this.notesApp).size() - 1);
			(this.notesApp).pop();
			return lastNote;
		}else {
			System.out.println("No more notes !..");
			return null;
		}

	}
	
	/**
	 * Displays all notes
	 */
	public void displayAllNotes() {
		System.out.println("\n---------Notes App----------");
		if(this.notesApp.size()>0) {
			for(Memento note: notesApp) 
				System.out.println(note.getMementoContent()+" ");
		}else {
			System.out.println("Nothing to display !..");
		}
	}
	
	/**
	 * Inner class which stores the notes
	 * @author Kavyapriya
	 *
	 */
	class Memento {
		private String note;
		
		public Memento setMemento(String note) {
			this.note = note;
			return this;
		}

		public String getMementoContent() {
			return this.note;
		}
		public Memento getMemento() {
			return this;
		}

	}
}
