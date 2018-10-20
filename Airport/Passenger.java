
public class Passenger extends Person {
	
	private int passport;

	 @Override
	 public void print() {
		 super.print();
		 System.out.println("Passsport: " + getPassport()+ "\n"); 
	 }
	
	
	
	
	
	// ----------------setters + getters------------//

	public int getPassport() {
		return passport;
	}

	public void setPassport(int passport) {
		this.passport = passport;
	}
	
	

}
