

	public class Passenger {
		
		private double flightPrice;
		private int maxSuitcaseWeight;
		private Suitcase suitcase;
		private int addedKiloPrice;
		
		
		public Passenger(double flightPrice, int maxSuitcaseWeight, Suitcase suitcase, int addedKiloPrice) {
			super();
			this.flightPrice = flightPrice;
			this.maxSuitcaseWeight = maxSuitcaseWeight;
			this.suitcase = suitcase;
			this.addedKiloPrice = addedKiloPrice;
		}


		public double getFlightPrice() {
			return flightPrice;
		}


		public void setFlightPrice(double flightPrice) {
			this.flightPrice = flightPrice;
		}


		public int getMaxSuitcaseWeight() {
			return maxSuitcaseWeight;
		}


		public void setMaxSuitcaseWeight(int maxSuitcaseWeight) {
			this.maxSuitcaseWeight = maxSuitcaseWeight;
		}


		public Suitcase getSuitcase() {
			return suitcase;
		}


		public void setSuitcase(Suitcase suitcase) {
			this.suitcase = suitcase;
		}


		public int getAddedKiloPrice() {
			return addedKiloPrice;
		}


		public void setAddedKiloPrice(int addedKiloPrice) {
			this.addedKiloPrice = addedKiloPrice;
		}
		
		
		

			

		}





