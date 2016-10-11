package fcu.iecs.oop;
import java.util.Scanner;
public class StringComparator {


public static void main(String[] args) {
		String eng1,eng2;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string 1:");
		eng1 = scanner.next();
		
		System.out.println("Enter a string 2:");
		eng2 = scanner.next();
		
    if(eng1.compareToIgnoreCase(eng2)==0)
    {System.out.println("The two strings are the same.");}
    else if(eng1.compareToIgnoreCase(eng2)!=0)
    {System.out.println("The two strings are not the same.");}
}}