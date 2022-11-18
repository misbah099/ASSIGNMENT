//QUESTION 3
package exceptionHandling;
public class MyCalculator {
public void mycalculator(int n,int p)throws ArithmeticException{
	try {
		if(n<=0||p<=0) {
			throw new ArithmeticException("'n' and 'p' shuld not be negative ");
		}else {
			System.out.println("The n^p is "+Math.pow(n, p));
		}
	}finally {
		System.out.println("End of the program");
	}}
public static void main(String[] args) {
	MyCalculator mcal=new MyCalculator();
	mcal.mycalculator(2, 0);
}
}

