package _03_tea_maker;

public class TeaMakerRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TeaBag green = new TeaBag("green");
		TeaBag pomegrante = new TeaBag("pomegrante");
		Kettle kettle = new Kettle();
		Cup cup = new Cup();
		kettle.boil();
		cup.makeTea(green, kettle.getWater());
	}

}
