package momento;
//Problem: undo operation without breaking encapsulation
//Solution: While adding new States, maintain a list of memento in a caretaker - only accessible to that caretaker. Is not visible to orignator.

import java.util.ArrayList;
import java.util.List;


public class NotesApp {
	private List<Memento> notesApp = new ArrayList<>();

	public List<Memento> getAllNotes() {
		return this.notesApp;
	}

	public void createNote(String noteContent) {
		(this.notesApp).add(new Memento().setMemento(noteContent));
	}

	public Memento deleteNote() {
		Memento lastNote = (this.notesApp).get((this.notesApp).size() - 1);
		(this.notesApp).remove((this.notesApp).size() - 1);

		return lastNote;
	}
	
	public void displayAllNotes() {
		System.out.println("---------Notes App----------");
		for(Memento note: notesApp) {
			System.out.println(note.getMementoContent()+" ");
		}
	}
	
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
