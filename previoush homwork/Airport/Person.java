
public abstract class Person {

	private String firstName;
	private String lastName;
	private int seniority;

	public void	print() {
			System.out.println("First name: " + getFirstName() + "\nLast name: " + getLastName() + "\nSeniority: " + getSeniority());	
	}
	// ----------------setters + getters------------//

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSeniority() {
		return seniority;
	}

	public void setSeniority(int seniority) {
		this.seniority = (seniority > -1) ? seniority : 0;
	}

}

/*
 * 
 * this.gradesAvg = (gradesAvg >=0 && gradesAvg<=100)?gradesAvg:0;
 * 
 * @Override public String toString(){ return "name: "+name+", isMale: "+isMale;
 * }
 * 
 * public abstract void morningActions();
 */