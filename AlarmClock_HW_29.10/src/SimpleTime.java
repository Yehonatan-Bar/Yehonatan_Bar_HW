
public class SimpleTime {
	private int hour;
	private int minute;
	private int second;

	public void setTime(int hour, int minute, int second) {
		this.hour = (hour >= 0 && hour < 24 ? hour : 0);
		this.minute = (minute >= 0 && minute < 60 ? hour : 0);
		this.second = (second >= 0 && second < 60 ? second : 0);
		;
	}

	public void add(SimpleTime addTime) {
		this.hour = (this.hour + addTime.hour) % 24;
		this.hour += addTime.minute / 60;
		this.minute = (this.minute + addTime.minute) % 60;
		this.minute += addTime.second / 60;
		this.second = (this.second + addTime.second) % 60;
	}

	public void addHour(int addedHour) {
		this.hour = (this.hour + addedHour) % 24;
	}

	public void addMinute(int addedMinute) {
		this.hour += (this.minute + addedMinute) / 60;
		this.minute = (this.minute + addedMinute) % 60;
	}

	public void addSecond(int addedSeconds) {
		this.minute += (this.second + addedSeconds) / 60;
		this.second = (this.second + addedSeconds) % 60;
	}

	public void tick() {
		addSecond(1);

	}

	public boolean equals(SimpleTime chekedTime) {
		return (this.hour == chekedTime.getHour() && this.minute == chekedTime.getMinute()
				&& this.second == chekedTime.getSecond() ? true : false);

	}

	public String toString() {
		return (getHour() < 9 ? "0" + getHour() : getHour()) + ":" + (getMinute() < 9 ? "0" + getMinute() : getMinute())
				+ ":" + (getSecond() < 9 ? "0" + getSecond() : getSecond());
	}

	// --------------- Getters, setters and Constructors-------------------//

	public SimpleTime(int hour, int minute, int second) {
		super();
		this.hour = (hour >= 0 && hour < 24 ? hour : 0);
		this.minute = (minute >= 0 && minute < 60 ? minute : 0);
		this.second = (second >= 0 && second < 60 ? second : 0);
	}
// void midnight SimpleTime
	public SimpleTime() {
		this.hour = 0;
		this.minute = 0;
		this.second = 0;

	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = (hour >= 0 && hour < 24 ? hour : 0);
		;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = (hour >= 0 && hour < 60 ? minute : 0);
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = (second >= 0 && second < 60 ? second : 0);
	}

}
