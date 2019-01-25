
public class Potato extends Items{
	
	int location = 20;

	public Potato(int location) {
		super();
		this.location = location;
	}

	public Potato() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isGold() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEdible() {
		// TODO Auto-generated method stub
		return true;
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
