package chapter12.test3;

public abstract class Inning {

	public Inning() throws BaseBallException{
	}
	public void event() throws BaseBallException{
		
	}
	public abstract void atBat() throws Strike,Foul;
	public void walk(){
		
	}
}
