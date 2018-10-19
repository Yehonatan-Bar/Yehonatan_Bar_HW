
public class Pilot extends Person {
	 private int flightLicenseNumber;

	 @Override
	 public void print() {
		 System.out.println(super.toString() + "\nFlight license number: " + getFlightLicenseNumber()); 
	 }
	 
		// ----------------setters + getters------------//

	public int getFlightLicenseNumber() {
		return flightLicenseNumber;
	}

	public void setAircraftLicenseNumber(int aircraftLicenseNumber) {
		this.flightLicenseNumber = flightLicenseNumber;
	}
	

}
/*
super.print() + 
*/