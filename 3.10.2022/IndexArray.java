/* 1. Write a Java program to find the index of an array element. */
package assignment;
import java.util.Scanner;

public class IndexArray {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
		int	arr[]= {1,2,3,4,5,6,7};
		System.out.println("Type the element which index you want to search");
		int a=sc.nextInt();
		int index=0;
		for(int i=0;i<arr.length;i++) {
		if(a==arr[i]) {
			index=i;
		}
		}
		System.out.println("The index of the array is "+index);
		}
		}

