 /* In this example, you have a base class Teacher and a sub class ITTeacher. Since class ITTeacher extends the designation and 
  * college properties and work () method from base class, we need not to declare these properties and method in sub class. 
  *Here we have college Name, designation and work ()
  *  method which are common to all the teachers so we have declared them in the base class, this way the child classes like Math
  *   Teacher, Music Teacher and PhysicsTeacher do not need to write this code and can be used directly from base class. */
package assignments;

public class Teacher {
	String designation="Teacher";
	String college="BB COLLEGE";
	public void work() {
		System.out.println("Designation: " +designation+ " College: " +college);
	}
}
class ITTeacher extends Teacher{
	
	String sub="Java";
	}
class MathTeacher extends Teacher{
	String sub="Mathematics";}
class MusicTeacher extends Teacher{
	String sub="Classic music";}
class PhysicsTeacher extends Teacher{
	String sub="Physics";}
