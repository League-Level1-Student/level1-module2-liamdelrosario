package _04_backpack;

public class BackpackRunner {
	public static void main(String[] args) {
		new Backpack().packAndCheck();
		Pencil pencil= new Pencil();
		Ruler ruler = new Ruler();
		Textbook textbook = new Textbook();
		pencil.write("I swear");
		ruler.measure();
		textbook.read();

	}
}