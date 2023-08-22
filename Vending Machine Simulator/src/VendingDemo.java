import java.util.Scanner;
public class VendingDemo {
	public static void getProduct(String productCode) {
		switch(productCode) {
		case "P01":
			System.out.println("Coca Cola");
			break;
		case "P02":
			System.out.println("Pepsi");
			break;
		case "P03":
			System.out.println("Fanta");
			break;
		case "P04":
			System.out.println("Jal Jeera");
			break;
		case "P05":
			System.out.println("Mountai");
			break;
		default:
			System.out.println("Not matching above product codes");
			
			
			
			
			
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String productCode=sc.nextLine();
		getProduct(productCode);
		// TODO Auto-generated method stub

	}

}
