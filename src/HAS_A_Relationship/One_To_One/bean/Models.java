package HAS_A_Relationship.One_To_One.bean;

public class Models {

	private String bN;
	private String mN;
	private String color;
	private double price;
	
	Engines engines;
	
	public Models(String bN, String mN, String color, double price){
		this.bN = bN;
		this.mN = mN;
		this.color = color;
		this.price = price;
		
	}
	
	public void setEngine(Engines engines){
		this.engines = engines;
	}
	
	public void showDetails(){
		System.out.println("All details about car model :- ");
		System.out.println("Brand name of the car is : " + bN);
		System.out.println("Model name of the car is : " + mN);
		System.out.println("Color of the car is : " + color);
		System.out.println("Price of the car is : " + price);
		System.out.println();
		System.out.println("=================================");
		System.out.println();
		System.out.println("All details about car engine :- ");
		System.out.println("The Cubic-Centimeters of the engine is : " + engines.getcC());
		System.out.println("The HorsePower of the engines is  : " + engines.gethP());
		System.out.println("The Speed-Transmissions of this engine is : " + engines.getsT());
		System.out.println("The Max-Speed of this engine is : " + engines.getmS());
	}
	
}
