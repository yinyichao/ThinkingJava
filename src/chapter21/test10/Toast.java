package chapter21.test10;

public class Toast {
	public enum Status{
		DAY,BUTTERED,JAMMED
	}
	private Status status = Status.DAY;
	private final int id;
	public Toast(int idn){
		id = idn;
	}
	public void butter(){
		status = Status.BUTTERED;
	}
	public void jam(){
		status = Status.JAMMED;
	}
	public Status getStatus(){
		return status;
	}
	public int getId(){
		return id;
	}
	public String toString(){
		return "Toast "+id+": "+status;
	}
}
