
public class PersonApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person Ben = new Pilot();
		Person Dan = new FlightAttendant();
		Person Hadas = new GroundAttendant();
		Person Or = new Passenger();

		Ben.setFirstName("Ben");
		Ben.setLastName("Lang");
		Ben.setSeniority(11);
		((Pilot) Ben).setFlightLicenseNumber(435);

		Dan.setFirstName("Dan");
		Dan.setLastName("Maor");
		Dan.setSeniority(44);
		((FlightAttendant) Dan).setOrigin("Israel");
		((FlightAttendant) Dan).setWitchClass("first");

		Hadas.setFirstName("Hadas");
		Hadas.setLastName("Bar");
		Hadas.setSeniority(5);
		((GroundAttendant) Hadas).setFunction("Wellcoming");
		((GroundAttendant) Hadas).setOrigin("Canada");

		Or.setFirstName("Or");
		Or.setLastName("Lumin");
		((Passenger) Or).setPassport(65467);

		Ben.print();
		Dan.print();
		Hadas.print();
		Or.print();
	}

}

/*
 * צרו את מחלקת הבסיס המתאימה לכל 4 המחלקות צרו את 4 המחלקות, והגדירו ירושה צרו
 * בתוכנית הראשית אובייקט מכל מחלקה, וקראו לפונקציית הprint
 */