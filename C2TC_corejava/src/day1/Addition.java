package day1;
import java.util.Scanner;
public class Addition {
	public static void main(String[] args) {
		int a ;
		int b ;
		int c ;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value");
		a=sc.nextInt();
		b=sc.nextInt();
		c =  a+b;
		System.out.print("addition of ="+ a + ", b = "+ b +" is " +c );
	}
}


