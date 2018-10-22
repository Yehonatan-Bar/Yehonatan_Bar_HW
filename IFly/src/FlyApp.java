// import java.util.Random;

public class FlyApp {

	public static IFly createIFly() {
		int max = 3;
		int min = 0;
		int num = (int) (Math.random() * (max - min)) + min;

		if (num == 0) {
			IFly tuki = new Bird("tukan", "red", 4);

			return tuki;
		}

		else if (num == 1) {
			IFly tomcat = new Plane("Dan", "Lokhid", "U.S.A");

			return tomcat;
		}

		else {
			IFly chuk = new Kite("red", 10);

			return chuk;

		}

	}

	public static void main(String[] args) {

		IFly[] flyers = new IFly[10];
		for (int i = 0; i < flyers.length; i++) {
			flyers[i] = createIFly();
			flyers[i].fly((int) (Math.random() * (100 - 0)) + 0);
			flyers[i].land();
			System.out.println(flyers[i].toString());
		}
	}

}
