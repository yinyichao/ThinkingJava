package chapter19.test6;

public interface Competitor <T extends Competitor<T>>{
	Outcome compete(T competitor);
}
