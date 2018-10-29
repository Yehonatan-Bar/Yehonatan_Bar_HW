package student;

public class student {
	private int score;
	private int age;
	static private int sumScore = 0;
	static private int sumAge = 0;
	static private int sumStudent = 0;

	public student(int score, int age) {
		super();
		this.score = score;
		this.age = age;
		student.sumScore += score;
		student.sumAge += age;
		student.sumStudent++;
	}

	public int getScore() {
		return score;
	}

	public static int avgScore() {
		return sumScore / sumStudent;
	}

	public static int avgAge() {
		return sumAge / sumStudent;
	}

	// ------------------------------------------------------------//
	public void setScore(int score) {
		this.score = score;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static int getSumScore() {
		return sumScore;
	}

	public static void setSumScore(int sumScore) {
		student.sumScore = sumScore;
	}

	public static int getSumAge() {
		return sumAge;
	}

	public static void setSumAge(int sumAge) {
		student.sumAge = sumAge;
	}

	public static int getSumStudent() {
		return sumStudent;
	}

	public static void setSumStudent(int sumStudent) {
		student.sumStudent = sumStudent;
	}
	// ------------------------------------------------------------//

}
