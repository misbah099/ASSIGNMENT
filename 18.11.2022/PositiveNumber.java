//QUESTION 2
package exceptionHandling;
public class PositiveNumber{
	PositiveNumber(int a,int b)throws ArithmeticException{
		try {
			if(a<0||b<0) {
				throw new ArithmeticException("non positive integer ");
			}else {
				System.out.println("The sum of two number is "+(a+b));
			}
		}finally {
			System.out.println("End of the program");
		}}
		public static void main(String args[]) {
			PositiveNumber p=new PositiveNumber(22,-1);
		
	}
}