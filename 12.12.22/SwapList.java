package collectionJava;

import java.util.Collections;
import java.util.LinkedList;

public class SwapList {
//WAP to swap the elements in the linkedlist
	public static void main(String[] args) {
		LinkedList<String>l=new LinkedList<String>();
		l.add("Apple");
		l.add("Banana");
		l.add("fig");
		l.add("Orange");
		l.add("Lemon");
		System.out.println("List is: "+l);
		//Swapping the element
		System.out.println("Swaping the element");
		Collections.swap(l, 3, 2);
		System.out.println("The swapped List is: "+l);
	}

}
