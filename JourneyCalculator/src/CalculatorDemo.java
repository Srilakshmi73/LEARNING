import java.util.Scanner;

public class CalculatorDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double speed = sc.nextDouble();
		double time = sc.nextDouble();
		CalculatorApp cal = new CalculatorApp();
		double dis =cal.calculateDistance(speed,time);
		System.out.println(dis);


		
		
		// TODO Auto-generated method stub

	}

}
