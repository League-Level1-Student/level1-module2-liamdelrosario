package _04_backpack;

public class BackpackRunner {
	public static void main(String[] args) {
		Pencil pencil= new Pencil();
		Ruler ruler = new Ruler();
		Textbook textbook = new Textbook();
		
		Backpack bac = new Backpack();
		bac.putInBackpack(pencil);
		bac.putInBackpack(ruler);
		bac.putInBackpack(textbook);
		bac.packAndCheck();
		pencil.write("I swear");
		ruler.measure();
		textbook.read();

	}
}