package JavaActivity1;

public class Activity3 {

	public static void main(String[] args) {
		
		double seconds = 1000000000;
		
		double EarthSeconds = 31557600;
		double MercurySeconds = 0.2408467;
		double VenusSeconds = 0.61519726;
		double MarsSeconds = 1.8808158;
		double JupiterSeconds = 11.862615;
		double SaturnSeconds = 29.447498;
		double UranusSeconds = 84.016846;
		double NeptuneSeconds = 164.79132;
		
		double EarthYear= seconds/EarthSeconds;
		System.out.println("Age on Earth: " + EarthYear);
		System.out.println("Age on Mercury: " + EarthYear/ MercurySeconds);
        System.out.println("Age on Venus: " + EarthYear/ VenusSeconds);
        System.out.println("Age on Mars: " + EarthYear/ MarsSeconds);
        System.out.println("Age on Jupiter: " + EarthYear/ JupiterSeconds);
        System.out.println("Age on Saturn: " + EarthYear/ SaturnSeconds);
        System.out.println("Age on Uranus: " + EarthYear/ UranusSeconds);
        System.out.println("Age on Neptune: " + EarthYear/ NeptuneSeconds);
	}

}
