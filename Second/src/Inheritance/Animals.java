package Inheritance;

public class Animals {

	private String Height;
	private String Weight;
	private String Bloodtype;
	private int Speed;

	public Animals() {
		this.Height = "* Average height 5ft";
		this.Weight = "* Average weight 50kg";
		this.Bloodtype = "* A";
		this.Speed = 100;
	}

	public Animals(String height, String weight, String bloodtype, int speed) {
		Height = height;
		Weight = weight;
		Bloodtype = bloodtype;
		Speed = speed;
	}

	public String getHeight() {
		return Height;
	}

	public String getWeight() {
		return Weight;
	}


	public String getBloodtype() {
		return Bloodtype;
	}

	public int getSpeed() {
		return Speed;
	}
	
	

}
