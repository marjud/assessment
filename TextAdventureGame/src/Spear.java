
public class Spear extends Items{
	
	int location = 100;
	int damage = 80;

	public Spear(int location) {
		super();
		this.location = location;
	}

	public Spear() {
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
		return true;
	}

}
