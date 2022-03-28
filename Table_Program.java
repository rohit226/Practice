
//Q 7 wap to ask a number from user and print table of that number

package Lab_loop;

import java.util.Scanner;

public class Table_Program {
	int num;
	
	void check()
	{
		Scanner s= new Scanner(System.in);
		System.out.print("Enter the number of = ");
		num=s.nextInt();
		System.out.println("Table of given number is ");
		//int c;
		for(int i=1;i<=10;i++)
		{
			//c=num*i;

			System.out.println(num+"*"+i+"="+num*i);
		}
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table_Program a= new Table_Program();
		a.check();

	}

}
