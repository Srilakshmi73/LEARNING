class Fan{
	int no_Of_Wings;
	String color;
	int cost;
	String brand;
	void rotate() {
		System.out.println("Fan can certainly rotate and color of it is "+color+" and brand is of " +brand+ " and the cost of it "+cost+" and it has no of wings of "+no_Of_Wings);
	}
	void blow_Air() {
		System.out.println("Fan can certainly  blow air and the color of the fan is " +color);
	}
	
}
public class FanApp{

	public static void main(String[] args) {
		Fan f1 = new Fan();
		f1.no_Of_Wings = 2;
		f1.color = "white";
		f1.cost = 2500;
		f1.brand = "crompton";
		System.out.println(f1.no_Of_Wings+" "+f1.color+" "+f1.cost+" "+f1.brand);
		Fan f2 = new Fan();
		f2.no_Of_Wings = 3;
		f2.color = "Brown";
		f2.cost = 3000;
		f2.brand = "ceiling fan";
		System.out.println(f2.no_Of_Wings+" "+f2.color+" "+f2.cost+" "+f2.brand);
		Fan f3 = new Fan();
		f3.no_Of_Wings = 4;
		f3.color = "Black";
		f3.cost = 5000;
		f3.brand = "Table fan";
		System.out.println(f3.no_Of_Wings+" "+f3.color+" "+f3.cost+" "+f3.brand);
		f1.rotate();
		f1.blow_Air();
		f2.rotate();
		f2.blow_Air();
		f3.rotate();
		f3.blow_Air();
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
