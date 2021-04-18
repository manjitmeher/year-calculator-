import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		
	System.out.print("Input the number of minutes : ");
		Scanner s= new Scanner(System.in);
		
		int min=s.nextInt();
		int day=min/1440;
		
		int remainday=day%365;
		int year=day/365;
		
		System.out.println(min+"minutes is approximately "+year+" years and "+remainday+" days.");
		
		
	}
}