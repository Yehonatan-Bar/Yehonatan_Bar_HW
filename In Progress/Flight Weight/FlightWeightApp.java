import java.util.Iterator;

public class FlightWeightApp {
	static String[] flightItemsList = new String[] { "Passport Pouch " , "Lipstick-sized portable charger "
			, "Europe power adapter " , "Virtual Private Network " , "Packing cubes " , "Natural Jet Lag relief pills "
			, "Travel insurance " , "Rain jacket Women�s and Men�s " , "Moisture-Wicking Scarf "
			, "Water bottle with built-in filter " , "Solid shampoo " , "Flexible Phone  " , "Tripod Travel daypack "
			, "Activated charcoal " , "Hanging toiletry bag " , "Rolling suitcase " , "Slippers "
			, "Flexible Neck Pillow " , "Makeup Removing Wipes " , "Ear Plugs " };

	public static Suitcase randomSuitcase() {
		Suitcase suitcase = new Suitcase();
		int numOfItems = (int) ((Math.random() * (10 - 5)) + 5);
		SingleCargo singleCargo = null;
		for (int i = 0; i < numOfItems; i++) {
			boolean isExists = true;

			while (isExists) {
				isExists = false;
				singleCargo = new SingleCargo((int) ((Math.random() * (16 - 1)) + 1),
						flightItemsList[(int) ((Math.random() * (19 - 0)) + 0)]);
				for (SingleCargo p : suitcase.getSuitcase())
					if (p.getSingleCargoName() == singleCargo.getSingleCargoName()) {
						isExists = true;
					}
			}

			suitcase.getSuitcase().add(singleCargo);
		}

		return suitcase;

	}

	public static void main(String[] args) {

		Passenger passenger = new Passenger(((Math.random() * (1000 - 100)) + 100),
				(int) ((Math.random() * (100 - 10)) + 10), randomSuitcase(), (int) ((Math.random() * (200 - 10)) + 10));
		
		
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
 * Rain jacket Women�s and Men�s Moisture-Wicking Scarf Water bottle with
 * built-in filter Solid shampoo Flexible Phone Tripod Travel daypack Activated
 * charcoal Hanging toiletry bag Rolling suitcase Slippers Flexible Neck Pillow
 * Makeup Removing Wipes Ear Plugs Sleeping Mask
 */