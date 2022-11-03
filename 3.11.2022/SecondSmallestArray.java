/* 3. Write a Java program to find the second smallest element in an array.  */
package assignment;
import java.util.Scanner;
public class SecondSmallestArray {
	public static void main(String args[]) 
	 {                  
	 int n;                                  
	 int t; 
int a[]= {1,2,3,4,5,6,7,8};       
	 //Finding second smallest element in an array   
	 for(int i=0;i<a.length;i++)                 
	 {   
	  for(int j=i+1;j<a.length;j++) 
	  {                          
	   if(a[i] > a[j]) 
	   {                                    
	    t=a[i];                                    
	    a[i]=a[j];                                    
	    a[j]=t; 
	   }                      
	  }} 
	 System.out.println("Second smallest number is "+a[1]); 
	 } }