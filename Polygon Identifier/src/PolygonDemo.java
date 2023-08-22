import java.util.Scanner;
public class PolygonDemo {
	public static void identifyPolygon(int sides) {
		switch(sides) {
		case 3:
			System.out.println("Triangle");
		    break;
		case 4:
			System.out.println("Quadrilateral");
			break;
		case 5:
			System.out.println("Pentagon");
			break;
		case 6:
			System.out.println("Hexagon");
			break;
		default:
			System.out.println("Polygon");
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sides = sc.nextInt();
		identifyPolygon(sides);
		
		// TODO Auto-generated method stub

	}

}
