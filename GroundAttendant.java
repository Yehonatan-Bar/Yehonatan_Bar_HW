
public class GroundAttendant extends Person {

	private String origin;
	private String function;
	

	 @Override
	 public void print() {
		 System.out.println(super.toString() + "\nOrigin: " + getOrigin() + "\nFunction: " + getFunction() ); 
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
