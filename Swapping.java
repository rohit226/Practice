//Q   How to swap two numbers without using a third variable?

package Function;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		System.out.println("swap before value"+" "+a+" "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping"+" "+a+" "+b);

	}

}
