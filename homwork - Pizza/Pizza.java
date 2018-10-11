
public class Pizza {
	private int diameter;
	private int slices;
	private int toppings;

	public Pizza(int diameter, int slices, int toppings) {
		super();
		this.diameter = diameter;
		this.slices = slices;
		this.toppings = toppings;
	}

	public int getDiameter() {
		return diameter;
	}

	public void setDiameter(int diameter) {
		if (diameter >= 10 || diameter <= 50) {
			this.diameter = diameter;
		} else {
			System.out.println("diameter must be between 10 to 50");
		}
	}

	public int getSlices() {
		return slices;
	}

	public void setSlices(int slices) {
		if (slices >= 1 || slices <= 8) {
			this.slices = slices;
		} else {
			System.out.println("slices's number must be between 1 to 8");
		}
	}

	public int getToppings() {
		return toppings;
	}

	public void setToppings(int toppings) {
		if (toppings >= 0 || slices <= 5) {
			this.toppings = toppings;
		} else {
			System.out.println("toppings number must be between 0 to 5");
		}
	}

	public boolean isBasicPizza() {
		if (getToppings() == 0) {
			return true;
		} else {
			return false;
		}
	}

	public void print() {
		System.out.println("the diameter's ordered pizza is " + getDiameter()
				+ "\nthe number of the slices for the ordered pizza is " + getSlices()
				+ "\nthe number of the topping's ordred pizza is " + getToppings());
		System.out.println();
		System.out.println("------------------------------");
		System.out.println();
	}

}
