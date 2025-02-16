package _01_sea_creature;

public class sea_creatureRunner {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SeaCreature sponge = new SeaCreature("spongebob");
		SeaCreature star = new SeaCreature("patrick");
		SeaCreature squid = new SeaCreature("squidward");
		sponge.eat();
		System.out.println(	sponge.getName());
		sponge.laugh();
		star.eat();
		star.laugh();
		System.out.println(star.getName());
		squid.eat();
		squid.laugh();
		System.out.println(squid.getName());
	}

}
