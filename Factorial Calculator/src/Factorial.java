import java.util.Scanner;
public class Factorial {
	public static void calculateFactorial(int n) {
		int fact=1;
		for(int i=n;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println(fact);
		
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		calculateFactorial(n);
		
		// TODO Auto-generated method stub

	}

}
