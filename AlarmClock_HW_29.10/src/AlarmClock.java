
public class AlarmClock {

	ExtentedTime currentTime;
	Alarm[] alarmTime = new Alarm[5];

	public AlarmClock() {
		super();
		this.currentTime.setTime(0, 0, 0);
		this.alarmTime[0].resetAlarm();
		this.alarmTime[1].resetAlarm();
		this.alarmTime[2].resetAlarm();
		this.alarmTime[3].resetAlarm();
		this.alarmTime[4].resetAlarm();
	}

	public void setAlarm(int alarmNum, SimpleTime time, boolean isSet, int snoozeTime, boolean isSnooze) {
		alarmTime[alarmNum-1] = new Alarm(time, isSet, snoozeTime, isSnooze);
	}
	
	public void setAlarm(int alarmNum, int hour, int minute, int second, boolean isSet, int snoozeTime, boolean isSnooze) {
		SimpleTime timer=new SimpleTime(hour, minute, second);
		alarmTime[alarmNum-1]=new Alarm(timer, isSet, snoozeTime, isSnooze);
	
	}

}
