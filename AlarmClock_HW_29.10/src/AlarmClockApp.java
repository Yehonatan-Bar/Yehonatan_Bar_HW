import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.text.SimpleDateFormat;

public class AlarmClockApp {
	static Scanner scan = new Scanner(System.in);

	public static void setTime() {
		System.out.print("Please set the clock using HH:MM:SS format: ");
		String time = scan.nextLine();
		String[] parts = time.split(":", 3);
		int hour = Integer.parseInt(parts[0]);
		int minute = Integer.parseInt(parts[1]);
		int second = Integer.parseInt(parts[2]);
		ExtentedTime clockTime = new ExtentedTime(hour, minute, second, false);

	}

	public static void setAlarmTime(int num) {
		System.out.println("Please set the alarm time using HH:MM:SS format: ");
		String alarmTime = scan.nextLine();
		String[] parts = alarmTime.split(":", 3);
		int alarmHour = Integer.parseInt(parts[0]);
		int alarmMinute = Integer.parseInt(parts[1]);
		int alarmSecond = Integer.parseInt(parts[2]);

		System.out.println("Do you want to set snooze? Y/N");
		String Snoozed = scan.nextLine();
		boolean isSnoozed = (Snoozed == "Y") ? true : false;

		AlarmClock alarm = new AlarmClock();
		alarm.setAlarm(num, alarmHour, alarmMinute, alarmSecond, true, 5, isSnoozed);
	}

	// ---------------- temp clock method--------------

	public static void clock(int num) {
		long timeMillis = System.currentTimeMillis();
//		 long timeSeconds3 = TimeUnit.MILLISECONDS.toSeconds(timeMillis);
		long timeSeconds = timeMillis / 1000;
		long timeMinutes = timeSeconds / 60;
		long timeHours = timeMinutes / 60;

		Long temp = (long) 0000000;
		SimpleDateFormat time = new SimpleDateFormat("HH:mm:ss");
		Date instant = new Date();
		String currentTime = time.format(instant);

		String[] parts = currentTime.split(":", 3);
		int hour = Integer.parseInt(parts[0]);
		int minute = Integer.parseInt(parts[1]);
		int second = Integer.parseInt(parts[2]);

//		System.out.println(currentTime);
//			System.out.println(timeSeconds);

		while (num != 0) {

			long timeMillis2 = System.currentTimeMillis();
			long timeSeconds2 = timeMillis2 / 1000;
			long timeMinutes2 = timeSeconds2 / 60;
			long timeHours2 = timeMinutes2 / 60;

			if (timeSeconds2 != temp) {
				System.out.println(((hour + ((timeHours2 - timeHours) % 24)) % 24) + ":"
						+ ((minute + ((timeMinutes2 - timeMinutes) % 60)) % 60) + ":"
						+ ((second + ((timeSeconds2 - timeSeconds) % 60)) % 60));

				temp = timeSeconds2;
			}

		}

	}

	public static void main(String[] args) {

		clock(10);

//		setTime();
//		setAlarmTime(1);
//		setAlarmTime(2);

	}

}

/*
 * int acct_hour = Integer.parseInt(arrMytime[0]); int acct_minute =
 * Integer.parseInt(arrMytime[1]); int acct_second =
 * Integer.parseInt(arrMytime[2]); String string = "004-034556"; String[] parts
 * = string.split("-"); String part1 = parts[0]; // 004 String part2 = parts[1];
 * // 034556
 * 
 * int playerMove = scan.nextInt() - 1; nextLine();
 * 
 * import java.text.SimpleDateFormat; import java.util.Date; public class
 * CurrentDateTimeExample2 { public static void main(String[] args) {
 * SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
 * Date date = new Date(); More items...
 * 
 */