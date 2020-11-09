package Inheritance;

public class Reptile extends Animals{
	private String Name;
	private String DrySkin;
	private String Backbone;
	private String Softshelledeggs;
	
	
	public Reptile() {
		super();
		this.Name = "Reptiles -- ";
		this.DrySkin = "1. Reptiles have Dry Skin";
		this.Backbone ="2. Reptiles have Small, flexible backbone";
		this.Softshelledeggs = "3. Reptiles lay Soft shelled and hard eggs";
	}
	
	
	
	public Reptile(String name, String drySkin, String backbone, String softshelledeggs) {
		super();
		Name = name;
		DrySkin = drySkin;
		Backbone = backbone;
		Softshelledeggs = softshelledeggs;
	}

	
	

	public String getName() {
		return Name;
	}



	public String getDrySkin() {
		return DrySkin;
	}


	public String getBackbone() {
		return Backbone;
	}


	public String getSoftshelledeggs() {
		return Softshelledeggs;
	}
	
	
	
	
}
