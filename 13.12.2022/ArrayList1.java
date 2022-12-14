//Problem 1
package assignments;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {
private ArrayList<Integer> A1 = new ArrayList<Integer>();
	
	public ArrayList<Integer> storeEvenNumbers(int N) {
		A1 = new ArrayList<Integer>();
		
		for (int i = 2; i <= N; i++) {
			if (i % 2 == 0) A1.add(i);
		}
			return A1;}
		public ArrayList<Integer> printEvenNumbers() {
		ArrayList<Integer> A2 = new ArrayList<Integer>();
		
		for (int item : A1) {
			A2.add(item * 2);
			System.out.print(+item * 2+" ");
		}
			return A2;}
	public int retrieveNumber(int N) {
		Iterator<Integer> it = A1.iterator();
		
		while (it.hasNext()) {
			if (it.next().equals(N))
				return N;	}
			return 0;}
		public static void main(String[] args) throws NullPointerException {
		ArrayList1 asg = new ArrayList1();
		asg.storeEvenNumbers(20);
		asg.printEvenNumbers();
		//asg.retrieveNumber(4);
		System.out.println("The answer is :"+asg.retrieveNumber(4));
		System.out.println("The answer is :"+asg.retrieveNumber(3));
}}
