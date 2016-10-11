package fcu.iecs.oop;
import java.util.Scanner;
public class KeyboardScanner {

	public static void main(String[] args) {
		int num1;
		float num2,num3;
		String name;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a integer:");
		num1 = scanner.nextInt();
		
		System.out.println("Enter a float point number:");
		num2 = scanner.nextFloat();
		
		System.out.println("Enter a you name:");
		name = scanner.next();
		//name = scanner.nextLine();
		
		num3=num1*num2;
		
		//System.out.println("Hi "+name+ ", the multiplication of "+num1+" and "+num2+" is "+num3);
		System.out.printf("Hi %s, the multiplication of %d and %.5f is %.2e ",name,num1,num2,num3);
		
	}

}
