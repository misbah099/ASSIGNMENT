package collectionJava;

import java.util.LinkedList;
//	WAP to insert element to a specific position
public class InsertElement {

	public static void main(String[] args) {
		LinkedList<String>l=new LinkedList<String>();
		l.add("Apple");
		l.add("Banana");
		l.add("fig");
		l.add("Orange");
		l.add("Lemon");
		System.out.println("List is: "+l);
		System.out.println("Adding Specific element");
		l.add(2,"Mango");
		System.out.println("New List: "+l);
	}

}
