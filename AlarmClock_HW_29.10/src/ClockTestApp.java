
public class ClockTestApp {

	public static void main(String[] args) {

//		SimpleTime clock1 = new SimpleTime(03, 44, 30);
//		SimpleTime clock2 = new SimpleTime(02, 2, 10);
//		clock1.toString();
//
//		System.out.println("clock1.add(clock2)");
//		clock1.add(clock2);
//		System.out.println(clock1.toString());
//
//		System.out.println("clock1.addMinute(16)");
//		clock1.addMinute(16);
//		System.out.println(clock1.toString());
		
		ExtentedTime clock3 = new ExtentedTime(3, 20, 20, true);
		ExtentedTime clock4 = new ExtentedTime(15, 30, 40, true);		
		ExtentedTime clock5 = new ExtentedTime(20, 40, 50, false);
		
		System.out.println(clock3.toString());
		System.out.println(clock4.toString());		
		System.out.println(clock5.toString());
	}

}
