import java.util.Scanner;
public class Prime {
	public static void printPrimes(int n) {
	
		for(int j=2;j<=n;j++) {
			int count=0;
			for(int i=1;i<=j;i++) {
				if(j%i==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(j);
			}
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printPrimes(n);
		// TODO Auto-generated method stub

	}

}
