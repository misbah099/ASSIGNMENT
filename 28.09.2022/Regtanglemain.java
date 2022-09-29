/* you will make a class ‘Rectangle’ and declare the variable

length and breadth as private. One Constructor will be used for 
initializing the value of variables. 

When an object is created, the constructor will be called and 
the default value of the instance variables will be assigned. 
Now create another new class ‘RectangleTest’ & create an 
object of class Rectangle and assign values of the parameter used 
in constructor. Calculate area of the rectangle and print 
it on the console. Let’s update the new value of variable. 
And then read the updated value. 
Sample Output:   
Area = 800
New area = 900 */
package firstJava;

public class Regtanglemain {

	public static void main(String[] args) {
		Rectangle r=new Rectangle();
		Rectangle r1=new Rectangle(2,4);
System.out.println("Area="+r.getArea());
System.out.println("New Area="+r1.getArea());

	}
}
