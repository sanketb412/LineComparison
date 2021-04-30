package linecompare;
import java.util.*;

public class linecompare {

	public static Double Compare()
	{
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
		
		Integer x = c - a;
		Integer y = d - b;
		
		if(x.equals(y))
		{
			System.out.println("\nEquality of 2 Length is preferable");
		}	
		else if(x > y)
		{		
			System.out.println("\nLength of 1st line is Greater then 2nd line");
		}
		else
		{
			System.out.println("\nLength of 2nd line is Greater then 1st line");
		}
		
		Double e = (double) ((x*x)+(y*y));
		Double t;
		Double Sqrt = e/2;
		do
		{
		t = Sqrt;
		Sqrt = (t + (e/t))/2;
		}
		while ((t - Sqrt) != 0);
		return Sqrt;
		
	}
	
	public static void main(String[] args)
	{
		System.out.println("\nThe Length of a line is:" +Compare());
	}

}

