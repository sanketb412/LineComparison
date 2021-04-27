package linecompare;
import java.util.*;
public class linecompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Line Comparison Computation");
		Scanner sc = new Scanner (System.in);
		System.out.println("\nEnter the first cordinates of x1");
		int a = sc.nextInt();
		System.out.println("\nEnter the first cordinates of y1");
		int b = sc.nextInt();
		System.out.println("\nEnter the first cordinates of x2");
		int c = sc.nextInt();
		System.out.println("\nEnter the first cordinates of y2");
		int d = sc.nextInt();
		System.out.println("\nA length as 2 Points are:(" +a +"," +b +")and(" +c +"," +d +")");
		
		int e = (((c-a)*(c-a))+((d-b)*(d-b)));
		
		System.out.println("\nThe Length of a line is:" +squareRoot(e));
	}
	public static double squareRoot (int e) {
		double f;
		double sqrtroot=e/2;
		do
		{
			f=sqrtroot;
			sqrtroot=(f+(e/f))/2;
		}
		while((f-sqrtroot)!=0);
		return sqrtroot;
	}
}

