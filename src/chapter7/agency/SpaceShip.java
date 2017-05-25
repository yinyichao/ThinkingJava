package chapter7.agency;

public class SpaceShip extends SpaceShipControls{
	private String name;
	public SpaceShip(String name){
		this.name = name;
	}
	public String toString(){
		return name;
	}
	public static void main(String[] args){
		SpaceShip x = new SpaceShip("NSEA Protector");
		x.forward(100);
	}
}
