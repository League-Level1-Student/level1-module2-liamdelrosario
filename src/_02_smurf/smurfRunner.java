package _02_smurf;

public class smurfRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Smurf handySmurf = new Smurf("Handy");
		Smurf papa = new Smurf("Papa");
		Smurf smurfette = new Smurf("Smurfette");
		System.out.println(handySmurf.getName());
		handySmurf.eat();
		System.out.println(handySmurf.getHatColor());
		System.out.println(handySmurf.isGirlOrBoy());
		System.out.println(papa.getName());
		papa.eat();
		System.out.println(papa.getHatColor());
		System.out.println(papa.isGirlOrBoy());
		System.out.println(smurfette.getName());
		smurfette.eat();
		System.out.println(smurfette.getHatColor());
		System.out.println(smurfette.isGirlOrBoy());
	}

}
