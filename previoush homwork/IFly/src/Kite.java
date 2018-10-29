
public class Kite implements IFly {

	private String color;
	private int price;

	@Override
	public void fly(int speed) {
		System.out.println("The kite speed is: " + speed);
	}

	@Override
	public boolean land() {
		return true;
	}

	
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Kite(String color, int price) {
		super();
		this.color = color;
		this.price = price;
	}

}