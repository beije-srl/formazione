package it.beije.formazione.maggio2018.base.linkedlist;

public class Node {

	public String name;
	public Node next;

	public Node(String name) {
		this.name = name;
		this.next = null;
	}

	public String toString() {
		return this.name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}
