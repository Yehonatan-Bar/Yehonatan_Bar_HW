
public class TestBankAccount {

	public static void main(String[] args) {
		BankAccount david = new BankAccount("David", "12345", 200, true, 50);
		BankAccount dor = new BankAccount("Dor", "22222", 1000, false, 0);

		System.out.println("david.deposit(50);");
		david.deposit(50);
		david.print();
		System.out.println("------------------------------------------");

		System.out.println("david.withdrawal(100);");
		david.withdrawal(100);
		david.print();
		System.out.println("------------------------------------------");

		System.out.println("david.withdrawal(170);");
		david.withdrawal(170);
		david.print();
		System.out.println("------------------------------------------");

		System.out.println("david.withdrawal(25);");
		david.withdrawal(25);
		david.print();
		System.out.println("------------------------------------------");

		System.out.println("david.withdrawal(10);");
		david.withdrawal(10);
		david.print();
		System.out.println("------------------------------------------");

		
		
		
		System.out.println("Dor.deposit(50);");
		dor.deposit(50);
		dor.print();
		System.out.println("------------------------------------------");

		System.out.println("Dor.withdrawal(1000);");
		dor.withdrawal(1000);
		dor.print();
		System.out.println("------------------------------------------");

		System.out.println("Dor.withdrawal(170);");
		dor.withdrawal(170);
		dor.print();
		System.out.println("------------------------------------------");

		System.out.println("Dor.withdrawal(25);");
		dor.withdrawal(25);
		dor.print();
		System.out.println("------------------------------------------");

		System.out.println("Dor.withdrawal(10);");
		dor.withdrawal(10);
		dor.print();
		System.out.println("------------------------------------------");


	}

}
