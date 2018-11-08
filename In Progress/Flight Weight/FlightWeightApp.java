
public class FlightWeightApp {
	static String[] genericFlightItemsList = new String[] { "Passport Pouch " + "Lipstick-sized portable charger "
			+ "Europe power adapter " + "Virtual Private Network " + "Packing cubes " + "Natural Jet Lag relief pills "
			+ "Travel insurance " + "Rain jacket Women’s and Men’s " + "Moisture-Wicking Scarf "
			+ "Water bottle with built-in filter " + "Solid shampoo " + "Flexible Phone  " + "Tripod Travel daypack "
			+ "Activated charcoal " + "Hanging toiletry bag " + "Rolling suitcase " + "Slippers "
			+ "Flexible Neck Pillow " + "Makeup Removing Wipes " + "Ear Plugs " };

	public static String getDifferentFlightItem () {
		int temp;
		boolean isExist;
		int [] check = new int[20];
		for (int i = 0; i < check.length; i++) {
			temp = (int) ((Math.random() * (19 - 0)) + 0);
			for (int j = 0; j < check.length; j++) {
				if (temp == check[j] ) {
					isExist= true;
				
			}
				String singleFlightItem = (isExist? enericFlightItemsList[check[i]]: ;
			
			
		} 
		
			 
		 };
		 
		return singleFlightItem;
	}
	
	
	public static Suitcase randomSuitcase() {
		Suitcase suitcase = new Suitcase();
		int numOfItems = (int) ((Math.random() * (10 - 5)) + 5);
		
		
		for (int i = 0; i < numOfItems; i++) {
		
			

			SingleCargo singleCargo = new SingleCargo((int) ((Math.random() * (16 - 1)) + 1),
					getDifferentFlightItem ());

			suitcase.getSuitcase().add(singleCargo);
		}

		return randomSuitcase;
	}

	public static void main(String[] args) {

		Passenger passenger = new Passenger(((Math.random() * (1000 - 100)) + 100),
				(int) ((Math.random() * (100 - 10)) + 10), suitcase, (int) ((Math.random() * (200 - 10)) + 10));

	}

}

/*
 * productsCart.add(product);
 * 
 * , ((Math.random() *(100 - 10)) , 10), suitcase,
 * 
 * return (Math.random() *(max - min)) , min;
 * 
 * 
 * Passport Pouch Lipstick-sized portable charger Europe power adapter Virtual
 * Private Network Packing cubes Natural Jet Lag relief pills Travel insurance
 * Rain jacket Women’s and Men’s Moisture-Wicking Scarf Water bottle with
 * built-in filter Solid shampoo Flexible Phone Tripod Travel daypack Activated
 * charcoal Hanging toiletry bag Rolling suitcase Slippers Flexible Neck Pillow
 * Makeup Removing Wipes Ear Plugs Sleeping Mask
 */