package assignment;
/* Write a Java method to compute the future investment value at a given interest rate for a specified number of years.

Sample data (Monthly compounded):
Input the investment amount: 1000
Input the rate of interest: 10
Input number of years:5 
 */
import java.util.Scanner;

public class Investment {
		 public static void main(String args[])
		    {
		        Scanner sc = new Scanner(System.in);
		       
		       System.out.print("Enter present value: ");
			double p=sc.nextInt();
			 System.out.print("Enter the interest rate: ");
			 double r=sc.nextInt();
			System.out.print("Enter the time period in years: ");
			 double y=sc.nextInt();
			double f=p*Math.pow((1+r/100),y);//yearly compound interest
			System.out.print("value is: "+f);
		  
		}}
