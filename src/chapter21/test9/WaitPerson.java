package chapter21.test9;

public class WaitPerson implements Runnable{
	private Restaurant restaurant;
	
	public WaitPerson(Restaurant restaurant) {
		this.restaurant = restaurant;
	}
	@Override
	public void run() {
		try{
			while(!Thread.interrupted()){
				synchronized(this){
					while(restaurant.meal == null)
						wait();
				}
				System.out.println("Waitperson get "+restaurant.meal);
				synchronized(restaurant.chef){
					restaurant.meal = null;
					restaurant.chef.notifyAll();
				}
			}
		}catch(InterruptedException e){
			System.out.println("WaitPerson interrupted");
		}
	}
}
