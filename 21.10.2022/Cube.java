/*Q2: Write a program to display the cube of the number upto given integer   */
package assignment;
import java.util.Scanner;

public class Cube {

	public static void main(String[] args) {
int i,n;
System.out.println("Enter the Range :");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(i=1;i<=n;i++) {
	System.out.println("Number is = "+i+"and its cube= "+i*i*i);
}
	}}
