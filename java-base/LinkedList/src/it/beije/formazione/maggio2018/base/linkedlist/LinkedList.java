package it.beije.formazione.maggio2018.base.linkedlist;

public class LinkedList {

	public Node head;
	private Node current;

	public void add(String s) {
		Node n = new Node(s);
		if (this.head == null) {
			this.head = n;
			return;
		}
		Node cursor = head;
		while (cursor.getNext() != null) {
			cursor = cursor.next;
		}
		cursor.setNext(n);
	}

	public String toString() {
		String result = "";
		if (this.head == null) {
			return "";
		}
		Node cursor = head;
		do {
			result = result + cursor.toString() + " ";
			cursor = cursor.getNext();
		} while (cursor != null);
		return result;
	}

	public void removeLast() {
		Node cursore = this.head;

		if (head == null)
			return;
		if (head.getNext() == null) {
			head = null;
			return;
		}
		do {
			if (cursore.getNext().getNext() == null) {
				cursore.setNext(null);
				return;
			}
			cursore = cursore.getNext();

		} while (cursore.getNext() != null);
	}

	
	// attenzione, c'è un errore che non trovo:
	// se si prova a togliere un elemento con lo stesso nome del primo elemento della lista cancella tutta la lista
	// regalo una caramella a chi trova il baco
	public void remove(String name) {
		Node cursore = this.head;
		if (cursore.getName().equals(name)) {
			if (head.getNext() != null) {
				this.head = head.getNext();
			}
			this.head = null;
			return;
		}

		if (cursore.getNext().name.equals(name)) {
			if (cursore.getNext().getNext() != null)
				cursore.setNext(cursore.getNext().getNext());
			else
				cursore.setNext(null);
			return;
		}

		do {
			cursore = cursore.getNext();
			if (cursore.getNext().name.equals(name)) {
				if (cursore.getNext().getNext() != null)
					cursore.setNext(cursore.getNext().getNext());
				else
					cursore.setNext(null);
			}
		} while (cursore.getNext().name != name);
	}

	public int size() {
		Node cursore = this.head;
		int n = 0;
		if (head == null) {
			return n;
		}
		do {
			if (n > 0)
				cursore = cursore.getNext();
			n++;

		} while (cursore.getNext() != null);
		return n;
	}

}
