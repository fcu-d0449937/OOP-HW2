package fcu.iecs.oop;
import java.util.Scanner;
public class CheckOddEven {

	public static void main(String[] args) {
		int num;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a integer:");
		num = scanner.nextInt();

    if(num%2==0)
    {System.out.println("The input integer is Even Number.");}
    else if(num%2!=0)
    {System.out.println("The input integer is Odd Number.");}
	}}
