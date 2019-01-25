
public class Treasure extends Items {
	
	int location = 50;

	public Treasure(int location) {
		super();
		this.location = location;
	}

	public Treasure() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isGold() {
		
		return true;
	}

	@Override
	public boolean isEdible() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isWearable() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isWeaopn() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
