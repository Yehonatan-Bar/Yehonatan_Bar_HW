
import java.util.ArrayList;

public class Suitcase extends SingleCargo {

	private ArrayList<SingleCargo> suitcase;
	private int suitcaseWeight = 0;

	public Suitcase() {
		super();
		this.suitcase = new ArrayList<SingleCargo>();
		this.suitcaseWeight = getSuitcaseWeight();
	}

	public void setSuitcase(ArrayList<SingleCargo> suitcase) {
		this.suitcase = suitcase;
	}

	public ArrayList<SingleCargo> getSuitcase() {
		return suitcase;
	}

	public int getSuitcaseWeight() {
		for (SingleCargo sum : this.suitcase) {
			this.suitcaseWeight += sum.getSingleCargoWeight();
		}
		return suitcaseWeight;

	}

}

