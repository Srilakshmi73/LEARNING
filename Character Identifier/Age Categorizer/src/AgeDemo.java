import java.util.Scanner;
public class AgeDemo {
	public static  void categorizeAge(int age) {
		if(age >=0 && age<=12) {
			System.out.println("Child");
			
		}
		else if(age>=13 && age<=19) {
			System.out.println("Teen");
		}
		else if(age>=20 && age<=58) {
			System.out.println("Adult");
		}
		else {
			System.out.println("Senior");
		}
		
		
			
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age");
		int age = sc.nextInt();
		categorizeAge(age);
		// TODO Auto-generated method stub

	}

}
