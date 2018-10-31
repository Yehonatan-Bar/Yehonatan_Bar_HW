import java.util.Scanner;

public class AlarmClockApp {
	static Scanner scan = new Scanner(System.in);
	
	public static void setTime () {
	System.out.print("Please set the clock using HH:MM:SS format: ");
	String time = scan.nextLine();
	String[] parts = time.split(":",3);
	int hour = Integer.parseInt(parts[0]);
	int minute = Integer.parseInt(parts[1]);
	int second = Integer.parseInt(parts[2]);
	ExtentedTime clockTime = new ExtentedTime(hour, minute, second, false);
	
	}
	
	public static void setAlarmTime (int num) {
	System.out.println("Please set the alarm time using HH:MM:SS format: ");
	String alarmTime = scan.nextLine();
	String[] parts = alarmTime.split(":",3);
	int alarmHour = Integer.parseInt(parts[0]);
	int alarmMinute = Integer.parseInt(parts[1]);
	int alarmSecond = Integer.parseInt(parts[2]);
	
	System.out.println("Do you want to set snooze? Y/N");
	String Snoozed = scan.nextLine();
	boolean isSnoozed = (Snoozed=="Y")?true:false; 
	
	AlarmClock alarm = new AlarmClock();
	alarm.setAlarm(num, alarmHour, alarmMinute, alarmSecond, true, 5, isSnoozed);
	}
	
	
	public static void main(String[] args) {
		setTime();
		setAlarmTime(1);
		setAlarmTime(2);
		

	
		
		
	}
	

}

/*
 * int acct_hour = Integer.parseInt(arrMytime[0]);
		int acct_minute = Integer.parseInt(arrMytime[1]);
		int acct_second = Integer.parseInt(arrMytime[2]);
 * String string = "004-034556"; String[] parts = string.split("-"); String
 * part1 = parts[0]; // 004 String part2 = parts[1]; // 034556
 * 
 * int playerMove = scan.nextInt() - 1; nextLine();
 * 
 */