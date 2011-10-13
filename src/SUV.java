
public class SUV extends Car{

	public SUV(String licensePlate, String owner, String address) {
		super(licensePlate, owner, address);
	}
	
	public String getLicensePlate(){
		return super.licensePlate+" SUV";
	}

}