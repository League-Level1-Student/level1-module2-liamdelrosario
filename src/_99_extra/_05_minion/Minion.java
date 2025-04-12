package _99_extra._05_minion;

public class Minion {

	public Minion(String string, int i, String string2, String string3) {
		// TODO Auto-generated constructor stub
		this.name= string;
		this.eyes= i;
		this.color= string2;
		this.master= string3;
	}

		private String name; 
		private int eyes; 
		private String color; 
		private String master;

	public Object getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public Object getEyes() {
		// TODO Auto-generated method stub
		return eyes;
	}

	public Object getColor() {
		// TODO Auto-generated method stub
		return color;
	}

	public void setMaster(String string) {
		// TODO Auto-generated method stub
		this.master= string;
	}

	public Object getMaster() {
		// TODO Auto-generated method stub
		return master;
	}
}