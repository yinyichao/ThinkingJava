package chapter21.test12;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Horse implements Runnable{
	private static int counter = 0;
	private final int id = counter++;
	private int strides = 0;
	private static Random rand = new Random(47);
	private static CyclicBarrier barrier;
	
	public Horse(CyclicBarrier barrier) {
		this.barrier = barrier;
	}
	public synchronized int getStrides(){
		return strides;
	}
	@Override
	public void run() {
		try{
			while(!Thread.interrupted()){
				strides += rand.nextInt(3);
			}
			barrier.await();
		}catch(InterruptedException e){
			
		}catch(BrokenBarrierException e){
			throw new RuntimeException();
		}
	}
	public String toString(){
		return "Horse "+id+" ";
	}
	public String tracks(){
		StringBuilder s = new StringBuilder();
		for (int i = 0; i < getStrides(); i++) {
			s.append("*");
		}
		s.append(id);
		return s.toString();
	}
}
