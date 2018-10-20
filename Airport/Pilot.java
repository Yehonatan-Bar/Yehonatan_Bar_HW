
public class Pilot extends Person {
	 private int flightLicenseNumber;

	 @Override
	 public void print() {
		 super.print();
		 System.out.println("Flight license number: " + getFlightLicenseNumber() + "\n"); 
	 }
	 
		// ----------------setters + getters------------//

	public int getFlightLicenseNumber() {
		return flightLicenseNumber;
	}

	public void setFlightLicenseNumber(int flightLicenseNumber) {
		this.flightLicenseNumber = flightLicenseNumber;
	}
	

}
/*
super.print() + 
*/