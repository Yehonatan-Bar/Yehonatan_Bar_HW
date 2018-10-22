
public class Bird implements IFly {

	private String breed;
	private String color;
	private int age;

	@Override
	public void fly(int speed) {
		System.out.println("The bird speed is: " + speed);
	}

	@Override
	public boolean land() {
		return true;
	}

	public Bird(String breed, String color, int age) {
		super();
		this.breed = breed;
		this.color = color;
		this.age = age;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}