/* Write a java program to find the duplicate values of an array of integer value */
package assignment;
public class DuplicateArray {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,4,5,6,7};
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {//this loop is checking the next num in array
			if(arr[i]==arr[j]) {//checking the duplicate number
				System.out.println("the duplicate element in array is="+arr[j]+"at the position of "+j);
			}
		}
	}
}
}
