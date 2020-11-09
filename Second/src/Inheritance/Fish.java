package Inheritance;

public class Fish extends Animals{
	private String Name;
	private String Liveinwater;
	String Hasgills;
	public Fish() {
		super();
		this.Name = "Fishes -- ";
		this.Liveinwater = "1. Fishes live in Water";
		this.Hasgills = "2. Fishes have gilss";
		
	}
	
	
	public Fish(String name, String liveinwater, String hasgills) {
		super();
		Name = name;
		Liveinwater = liveinwater;
		Hasgills = hasgills;
	}


	public String getName() {
		return Name;
	}


	public String getLiveinwater() {
		return Liveinwater;
	}


	public String getHasgills() {
		return Hasgills;
	}

	
	
}