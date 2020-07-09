package JavaActivity1;

public class Activity1 {
	public static void main(String[] args) {
		Car xyz= new Car();
		xyz.make=2014;
		xyz.color= "Black";
		xyz.transmission = "Manual";
		
		xyz.displayCharacteristics();
		xyz.accelarate();
		xyz.brake();
		}
}