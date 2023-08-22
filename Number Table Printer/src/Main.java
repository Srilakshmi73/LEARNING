import java.util.Scanner;
public class Main {
	
	public static void printTable(int num) {
		for (int i=1;i<=10;i++) {
			System.out.println(num+ "*" + i + "=" +num*i);
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		printTable(num);
		
		// TODO Auto-generated method stub

	}

}
