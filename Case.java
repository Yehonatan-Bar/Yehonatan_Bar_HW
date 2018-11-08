import java.util.ArrayList;

public class Case extends Product {

	private ArrayList<Product> productsCase;
	private int totalWeight = 0;

	public Case(int totalWeight, String productName) {
		super(totalWeight, productName);
		this.productsCase = new ArrayList<Product>();
		
	}

	public ArrayList<Product> getProductsCase() {
		return productsCase;
	}

	public int getTotalWeight() {
		return totalWeight;
	}

	public void setTotalWeight() {
		this.totalWeight = totalWeight;
		getProductWeight()
	}

}

/*
 * אוסף של חפצים משקל כולל של כל החפצים
 */
