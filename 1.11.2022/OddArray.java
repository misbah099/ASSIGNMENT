/* we need to print the element of the array which are present in odd position */
package assignment;

public class OddArray {

	public static void main(String[] args) {
int a[]= {1,2,3,4,5,6,7,8,9,10,11,12,13};
for(int i=0;i<a.length;i+=2) {
	System.out.println("The numbers at odd position are="+a[i]);
}

	}

}
