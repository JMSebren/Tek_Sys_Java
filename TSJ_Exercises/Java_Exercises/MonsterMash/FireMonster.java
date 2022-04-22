package MonsterMash;

public class FireMonster extends Monster {

	public FireMonster() {
		super();
	}

	public FireMonster(String name) {
		super(name);
	}

	@Override
	public String attack() {
		return "Attack with fire!";
	}
	
}
