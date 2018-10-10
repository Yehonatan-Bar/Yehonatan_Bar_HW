import java.util.Scanner;
import java.util.Scanner;

public class SeatBuyingProgram2 extends SeatBuying {

	public SeatBuyingProgram2(double price, boolean isToken) {
		super(price, isToken);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SeatBuying[][] newChair = new SeatBuying[4][3];

		int min = 70;
		int max = 90;
		double totalPrice = 0.0;

		Scanner chairsNum = new Scanner(System.in);
		Scanner line = new Scanner(System.in);
		Scanner column = new Scanner(System.in);
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				newChair[i][j] = new SeatBuying((Math.random() * (max - min)) + min, false);
			}

		}

		System.out.print("Please insert the  number of chairs you want to buy: ");
		int x = chairsNum.nextInt();

		for (int i = 0; i < x; i++) {

			System.out.print("Please insert the chair line you want: ");
			int chairline = line.nextInt();
			if (chairline > 3 || chairline < 0) {
				System.out.println("there is no such line");
				i--;
			} else {

				System.out.print("Please insert the chair column you want: ");
				int chaircolumn = line.nextInt();

				if (chaircolumn > 2 || chaircolumn < 0) {
					System.out.println("there is no such column");
					i--;

				} else {

					if (newChair[chairline][chaircolumn].isToken() == false) {
						newChair[chairline][chaircolumn].setToken(true);
						totalPrice += newChair[chairline][chaircolumn].getPrice();
					} else {
						System.out.println("this seat is already token");
						i--;
					}
				}
			}
		}
		System.out.println();
		System.out.println("------------------------------------");
		System.out.println("You chose the following chairs: ");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				if (newChair[i][j].isToken() == true) {
					System.out.print(i + "," + j);
					System.out.println();

				}
			}
		}
		System.out.println("yhe price is: " + totalPrice);
	}
}

// int[][] chosenChairs = new int[]
