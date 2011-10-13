
public class Test {

	public static void main(String[] args){
		testCase();
	}
	
	private static void testCase(){
		
		// Create new Test-Cars
		Car car0 = new Car("BN-548", "Mickey Mouse", "Römerstraße 1","green");
		Car car1 = new Car("BN-123", "Donald Duck", "Römerstraße 5","blue");
		Car car2 = new Car("K-481", "Tick Duck", "Kölnstraße 1","red");
		Car car3 = new Car("BN-123", "Trick Duck", "Kölnstraße 1","yellow");
		Car car4 = new Car("BN-123", "Track Duck", "Kölnstraße 1","pink");
		Car SUV = new Car("BN-1235", "Dagobert Duck", "Kölnstraße 1","brown");
		
		// Register at TrafficOffice
		TrafficOffice.registerCar(car0);
		TrafficOffice.registerCar(car1);
		TrafficOffice.registerCar(car2);
		TrafficOffice.registerCar(car3);
		TrafficOffice.registerCar(car4);
		
		// Print registered Cars
		TrafficOffice.printLicensePlates();
	}
	
}
