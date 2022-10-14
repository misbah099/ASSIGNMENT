package inheritance;
//1.write a java program to print sum of odd numbers upto N?
import java.util.Scanner;

public class SumofOdd {

	public static void main(String[] args) {
int N,i,sum=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the the num till where you want result");
N=sc.nextInt();
for( i=1;i<=N;i++) {
	if(i%2==1) {
		sum+=i;
	}}
System.out.println("the sum of 'N' numbers of odd numbers are="+sum);
	}

}
