
public class Product {
	
	private int productWeight;
	private String productName;
	
	public Product(int productWeight, String productName) {
		super();
		setProductWeight(productWeight);
		setProductName(productName);
	}

	public int getProductWeight() {
		return productWeight;
	}

	public void setProductWeight(int productWeight) {
		this.productWeight = productWeight;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	

}
