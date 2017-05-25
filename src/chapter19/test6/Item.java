package chapter19.test6;

public interface Item {
	Outcome compete(Item it);
	Outcome eval(Paper p);
	Outcome eval(Scissors s);
	Outcome eval(Rock r);
}
