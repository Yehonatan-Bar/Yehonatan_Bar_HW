
public class ClockTestApp {

	public static void main(String[] args) {

		SimpleTime clock1 = new SimpleTime(03, 44, 30);
		SimpleTime clock2 = new SimpleTime(02, 2, 10);
		clock1.toString();

		System.out.println("clock1.add(clock2)");
		clock1.add(clock2);
		System.out.println(clock1.toString());

		System.out.println("clock1.addMinute(16)");
		clock1.addMinute(16);
		System.out.println(clock1.toString());
		
		
	}

}
