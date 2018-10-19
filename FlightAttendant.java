
public class FlightAttendant extends Person {

	private String origin;
	private String witchClass;

	@Override
	public void print() {
		System.out.println(super.toString() + "\norigin: " + getOrigin() + "\nClass: " + getWitchClass());
	}
	
	// ----------------setters + getters------------//

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getWitchClass() {
		return witchClass;
	}

	public void setWitchClass(String witchClass) {
		this.witchClass = (witchClass.equals("first") || witchClass.equals("business") || witchClass.equals("economy")?witchClass:"economy");
	}

}
