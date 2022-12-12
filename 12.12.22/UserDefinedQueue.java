package collectionJava;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;

public class UserDefinedQueue {
	public static void main(String[] args) {
		BankQueue b=new BankQueue(12345,"Misbah",50000.43,22);
		BankQueue b1=new BankQueue(12346,"Nisha",40000.32,21);
		BankQueue b2=new BankQueue(12347,"Somyo",44000.48,23);
		BankQueue b3=new BankQueue(12348,"Abhishiek",55000.73,22);
		BankQueue b4=new BankQueue(12349,"Shruti",50000.55,22);
		BankQueue b5=new BankQueue(12350,"Sourav",52000.22,24);

		Deque<BankQueue>dq=new ArrayDeque<BankQueue>();
		dq.add(b);
		dq.add(b1);
		dq.add(b5);
		dq.add(b3);
		dq.add(b2);
		dq.add(b4);
		Iterator itr=dq.iterator();
		while(itr.hasNext()) {
			BankQueue obj=(BankQueue) itr.next();
			System.out.println(obj.accountNo+" "+obj.customerName+" "+obj.balance+" "+obj.customerAge);
			
		}
	}}
