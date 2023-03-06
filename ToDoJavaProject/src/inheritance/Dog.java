package inheritance;

public class Dog extends Animal{
	int speedRun;
	public void setValue(int leg,String color,int speed) {
		this.noLeg=leg;
		this.Color=color;
		this.speedRun=speed;
	}
	
	public void eat() {
		//super.speak();
		System.out.println("Eating.....");
	}
	
	public void speak() {
		super.speak();
		System.out.println("Barks");
	}

}
