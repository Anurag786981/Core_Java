import java.util.Scanner;

public class First {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		menudrivenfunction();
		int a=scanner.nextInt();
		switch (a) {
		case 1:
			add();
			break;
		case 2:
			Second sc =new Second();
			sc.sub();
			break;
		default:
			System.out.println("Invalid Input !!!!");
			break;
		}		
	}	
	public static void add() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int a= scanner.nextInt();
		System.out.println("Enter the second number : ");
		int b= scanner.nextInt();
		int c= a+b;
		System.out.println("Sum of two numbers is : "+c);		
	}
	private static void menudrivenfunction() {
		
		System.out.println("Press 1 for addition :");
		System.out.println("Press 2 for substraction :");	
	}
}
