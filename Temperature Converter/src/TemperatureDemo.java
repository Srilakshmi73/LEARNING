import java.util.Scanner;
public class TemperatureDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double fahrenheit = sc.nextDouble();
		TemperatureDemoApp temp = new TemperatureDemoApp();
		double res = temp.convertFahrenheitToCelsius(fahrenheit);
		System.out.println(res);
		
		// TODO Auto-generated method stub

	}

}
