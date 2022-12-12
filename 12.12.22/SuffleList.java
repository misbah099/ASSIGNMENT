package collectionJava;

import java.util.Collections;
import java.util.LinkedList;
//WAP to suffle all the element in the list
public class SuffleList {

	public static void main(String[] args) {
		LinkedList<String>l=new LinkedList<String>();
		l.add("Apple");
		l.add("Banana");
		l.add("fig");
		l.add("Orange");
		l.add("Lemon");
		System.out.println("List is: "+l);
		System.out.println("Suffling the element");
		Collections.shuffle(l);
		System.out.println("Suffeled List :"+l);
	}}
