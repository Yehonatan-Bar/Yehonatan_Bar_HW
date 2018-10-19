
public class Passenger extends Person {
	
	private int passport;

	 @Override
	 public void print() {
		 System.out.println(super.toString() + "\nPasssport: " + getPassport()); 
	 }
	
	
	
	
	
	// ----------------setters + getters------------//

	public int getPassport() {
		return passport;
	}

	public void setPassport(int passport) {
		this.passport = passport;
	}
	
	

}
