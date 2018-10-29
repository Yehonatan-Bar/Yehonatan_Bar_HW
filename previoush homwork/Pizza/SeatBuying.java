
public class SeatBuying {
	
	double price;
	boolean isToken=false;
	
	//static int[][] chairs = new int[4][3];

	public SeatBuying(double price, boolean isToken) {
		super();
		this.price = price;
		this.isToken = isToken;
		//this.chairs = chairs;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		price = price;
	}

	public boolean isToken() {
		return isToken;
	}

	public void setToken(boolean isToken) {
		this.isToken = isToken;
	}

//	public int[][] getChairs() {
//		return chairs;
//	}
//
//	public void setChairs(int[][] chairs) {
//		this.chairs = chairs;
//	}
	
	
	

}
