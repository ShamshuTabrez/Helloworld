package Inheritance;

public class Bird extends Animals {
	private String Name;
	private String AnimalsWithFeathers;
	String CanFly;
	public Bird() {
		super();
		this.Name = "Birds -- ";
		this.AnimalsWithFeathers = "1. Animals with feathers";
		this.CanFly = "2. Birds fly";
		
	}
	public Bird(String name, String animalsWithFeathers, String canFly) {
		super();
		Name = name;
		AnimalsWithFeathers = animalsWithFeathers;
		CanFly = canFly;
	}
	public String getName() {
		return Name;
	}
	public String getAnimalsWithFeathers() {
		return AnimalsWithFeathers;
	}
	public String getCanFly() {
		return CanFly;
	}
	
	
	
}
