import java.util.Scanner;
public class NaturalNumbers {
	public static void calculateSum(int n) {
		int sum=0;
		
		for(int i=1;i<=10;i++) {
			
			sum = sum +i;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		calculateSum(n);
		// TODO Auto-generated method stub

	}

}
