package it.beije.formazione.maggio2018.base.linkedlist;

public class TestLikedList {

	public static void main(String[] args) {
		LinkedList lista = new LinkedList();

		lista.add("pane");
		lista.add("latte");
		lista.add("giornale");

		System.out.println(lista);

		lista.remove("pane");

		System.out.println("dopo della rimozione \n" + lista);

		System.out.println(lista.size());
	}

}
