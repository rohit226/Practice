//Q wap to check greater number among three numbers

package Function;
import java.util.Scanner;
public class Greaternum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner e=new Scanner(System.in);
		System.out.println("Enter the three numbers");
		a=e.nextInt();
		b=e.nextInt();
		c=e.nextInt();
		
		if(a>b)
			System.out.println("\n"+a+" is greater than "+b+" and "+c);
		else if(b>c)
			System.out.println("\n"+b+" is greater than "+c+" and "+a);
		else
			System.out.println("\n"+c+" is greater than "+b+"and "+a);
		

	}

}
