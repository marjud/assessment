
public class Watch extends Items{
	
	public Watch(int location) {
		super();
		this.location = location;
	}

	public Watch() {
		// TODO Auto-generated constructor stub
	}

	int location = 30;

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
		return true;
	}

	@Override
	public boolean isWeaopn() {
		// TODO Auto-generated method stub
		return false;
	}

}
