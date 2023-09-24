import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int a= scanner.nextInt();
		System.out.println("Enter the second number : ");
		int b= scanner.nextInt();
		int c= a+b;
		System.out.println("Sum of two numbers is : "+c);
		
	}
}
