 public class Cabrio extends Car{

	public Cabrio(String licensePlate, String owner, String address) {
		super(licensePlate, owner, address);
	}
	
	public String getLicensePlate(){
		return super.licensePlate+" Cabrio";
	}

}