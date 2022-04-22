package MonsterMash;

public class Main {

	public static void main(String[] args) {
		
		// instantiate monsters
		Monster m1 = new FireMonster("dopey");
		Monster m2 = new WaterMonster("u2r2");
		Monster m3 = new StoneMonster("r2r2");

		// call attack method for each monster
		System.out.println(m1.attack());
		System.out.println(m2.attack());
		System.out.println(m3.attack());
		
		
		// dopey died and is reborn with rocks for brains
		m1 = new StoneMonster("ypdoe");
		System.out.println(m1.attack());
		
		// monster 4 joins the fray, but he's a little confused as to what he's supposed to be
		Monster m4 = new Monster("IiIi");
		System.out.println(m4.attack());
		
	}

}
