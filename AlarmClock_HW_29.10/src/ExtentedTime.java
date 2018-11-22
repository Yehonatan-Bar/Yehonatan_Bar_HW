
public class ExtentedTime extends SimpleTime {
	private boolean is24Hours;

	public ExtentedTime() {
		super(0, 0, 0);
		this.is24Hours = true;
		
	}

	public ExtentedTime(int hour, int minute, int second, boolean is24Hours) {
		super((is24Hours?hour:hour%12), minute, second);
		this.is24Hours = is24Hours;
	}

	public boolean isIs24Hours() {
		return is24Hours;
	}

	public void setIs24Hours(boolean is24Hours) {
		this.is24Hours = is24Hours;
	}
	
	@Override
	public String toString () {
		return super.toString();
	}
	
	
	

}
