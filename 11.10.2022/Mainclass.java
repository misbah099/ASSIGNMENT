/* Problem 2 :

Class A serves as a base class for the derived class B, 
which in turn serves as a base class for the derived class C.
(Which type Of Inheritance explain with an example)
 */
//ANS= MULTILEVEL INHERITANCE IS ACHIVING IN THIS  QUESTION
package assignments;

class A {
	void running() {
		System.out.println("Class A is Running");
	}}

class B extends A{
	void run() {
		System.out.println("Class B is Running");
	}}
class C extends B{
	void ran() {
		System.out.println("Class C is Running");
	}}
class Mainclass{
	public static void main(String[] args) {
		C cr=new C();
		cr.running();
		cr.run();
		cr.ran();
	}
}