
public class GroundAttendant extends Person {

	private String origin;
	private String function;
	

	 @Override
	 public void print() {
		 super.print();
		 System.out.println("Origin: " + getOrigin() + "\nFunction: " + getFunction() + "\n"); 
	 }
	
	
	// ----------------setters + getters------------//

	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getFunction() {
		return function;
	}
	public void setFunction(String function) {
		this.function = function;
	}
	
	
	
}
