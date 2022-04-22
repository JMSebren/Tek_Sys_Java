package MonsterMash;

public class WaterMonster extends Monster {

	public WaterMonster() {
		super();
	}

	public WaterMonster(String name) {
		super(name);
	}

	@Override
	public String attack() {
		return "Attack with water!";
	}
}
