
public class Plane implements IFly {
	private String pilotName;
	private String compName;
	private String destination;

	@Override
	public void fly(int speed) {
		System.out.println("The plane speed is: " + speed);
	}

	@Override
	public boolean land() {
		return true;
	}

	public Plane(String pilotName, String compName, String destination) {
		super();
		this.pilotName = pilotName;
		this.compName = compName;
		this.destination = destination;
	}

	public String getPilotName() {
		return pilotName;
	}

	public void setPilotName(String pilotName) {
		this.pilotName = pilotName;
	}

	public String getCompName() {
		return compName;
	}

	public void setCompName(String compName) {
		this.compName = compName;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

}
