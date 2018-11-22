import java.text.SimpleDateFormat;
import java.util.Date;

public class ClockMathod {

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
	
}
