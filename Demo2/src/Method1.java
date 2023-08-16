import java.util.Scanner;
public class Method1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name : ");
		String a =  sc.next();
		System.out.println("Enter the Date of Birth of the person : ");
		int b = sc.nextInt();
		
		//System.out.println(a);
		greet(a);
		int res = age(b);
		System.out.println("You are " +res+ "years old");
		
		
		
		
		// TODO Auto-generated method stub

	}
	public static void greet(String a)
	{
		System.out.println("Hello "+a+"....");
	}
	public static int age (int b)
	{
		int c = 2023 - b;
		
		return c;
	}
	
	

}
