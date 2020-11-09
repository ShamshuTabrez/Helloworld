package Inheritance;

public class Demo {

	public static void main(String[] args) {
		Animals a = new Animals();
		Reptile rep = new Reptile();
		Fish f = new Fish();
		Bird b = new Bird();

		System.out.println(rep.getName() + "   " + rep.getDrySkin() + "   " + rep.getBackbone() + "   "
				+ rep.getSoftshelledeggs() + "   " + a.getHeight() + "   " + a.getBloodtype() + "   " + a.getWeight()
				+ "   " + a.getSpeed());

		System.out.println(f.getName() + "   " + f.getLiveinwater() + "   " + f.getHasgills() + "   " + a.getHeight()
				+ "   " + a.getBloodtype() + "   " + a.getWeight() + "   " + a.getSpeed());

		System.out.println(b.getName() + "   " + b.getAnimalsWithFeathers() + "   " + b.getCanFly() + "   "
				+ a.getHeight() + "   " + a.getBloodtype() + "   " + a.getWeight() + "   " + a.getSpeed());

		
		Reptile r = new Reptile("SNAKE ---  ", "1. Snakes have dry & scaly skin", 
				"2. Snakes have small & flexible backbone", "3. Snakes lay soft shelled eggs");
		Animals a1 = new Animals("4. Avg height of Reptiles is 5ft", "5. Avg weight of Reptiles is 50kg",
				"6. Bloodtype of Reptiles is A", 100);
		System.out.println(r.getName() + "   "+ r.getDrySkin() + "   " + r.getBackbone() + "   "+ 
				r.getSoftshelledeggs()+ "   "+ a1.getHeight()+ "   "+ a1.getWeight()+ "   "+a1.getBloodtype());
		
		
		Fish f1 = new Fish("Fishes --- ", "1. Fishes live in water", "2. Fishes have gills");
		Animals a2 = new Animals("3. Avg height of Fishes is 10ft", "4. Avg weight of Fishes is 250kgs",
				"5. Bloodtype of Fishes is ____", 80);
		System.out.println(f1.getName() + "   "+ f1.getLiveinwater() + "   "+ f1.getHasgills()
		 + "   "+ a2.getHeight() + "   "+ a2.getWeight() + "   "+ a2.getBloodtype());
	
		Bird b1 = new Bird("Birds --- ", "1. Birds are animals with Feathers", "2. Birds can Fly");
		Animals a3 = new Animals("3. Avg height of Birds is 1ft", "4. Avg weight of Birds is 25kgs",
				"5. Bloodtype of Birds is___", 50);
		
		System.out.println(b1.getName() + "   "+ b1.getAnimalsWithFeathers() + "   "+ b1.getCanFly() + "   "+ 
		a3.getHeight() + "   "+  a3.getWeight() + "   "+ a3.getBloodtype());
		
	}

}
