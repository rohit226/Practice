//Q   How to swap two numbers without using a third variable?

/*package Function;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		System.out.println("Before swap"+ " " +a+ " " +b);
		a=a+b;//10+20=30  a=30
		b=a-b; //30-20=10 b=10
		a=a-b; //30-10=20 a=20
		System.out.println("After Swap"+ " " +a+ " " +b);

	}

}*/
//Q How to swap two numbers with using a third variables?

package Function;
public class Practice1 {
	public static void main(String args[]) {
		int a=10;
		int b=20;

		
		System.out.println("before swapping"+" "+a+ " "+b);
		int temp=a; //temp=10
		a=b; // a=20
		b=temp; // b=10
		System.out.println("After swaping"+" "+a+" "+b);

	}
}