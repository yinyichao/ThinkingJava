package chapter21.test13;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class PrioritizedTask implements Runnable,Comparable<PrioritizedTask>{
	private Random rand = new Random(47);
	private static int counter = 0;
	private final int id = counter++;
	private final int priority;
	private static List<PrioritizedTask> sequence = new ArrayList<PrioritizedTask>();
	
	public PrioritizedTask(int priority) {
		this.priority = priority;
		sequence.add(this);
	}

	@Override
	public int compareTo(PrioritizedTask o) {
		return priority < o.priority ? 1: (priority>o.priority ? -1:0);
	}

	@Override
	public void run() {
		try{
			TimeUnit.MILLISECONDS.sleep(rand.nextInt(250));
		}catch(InterruptedException e){
			
		}
		System.out.println(this);
	}
	public String toString(){
		return String.format("[%1$-3d]", priority)+" Task "+id;
	}
	public String summary(){
		return "("+id+":"+priority+")";
	}
	public static class EndSentinel extends PrioritizedTask{
		private ExecutorService exec = Executors.newCachedThreadPool();
		public EndSentinel(ExecutorService exec) {
			super(-1);
			this.exec = exec;
		}
		public void run(){
			int count = 0;
			for (PrioritizedTask pt : sequence) {
				System.out.println(pt.summary());
				if(++count % 5 ==0){
					System.out.println();
				}
			}
			System.out.println();
			System.out.println(this+" Calling shutdownNow()");
			exec.shutdown();
		}
	}
}
