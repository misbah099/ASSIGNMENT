/* Write a java Program to test if an array contains a Specific value */
package assignment;

import java.util.Scanner;

public class FindArray {
public static void main(String[] args) {
	int a[]= {10,20,30,40,50};
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number you want to check=");//taking as a input
	int num=sc.nextInt();
	for(int i=0;i<a.length;i++) {
		if(num==a[i]) {//checking the num present or not
			System.out.println("the number is present in array at the index of="+i);
		}
		else {
			System.out.println("The number is not present in array");
			break;
		}
	}
}
}
