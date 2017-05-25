package chapter21.test7;

public class ExplicitCriticalSection {
	public static void main(String[] args) {
		PairManager
			pman1 = new ExplicitPairManger1(),
			pman2 = new ExplicitPairManager2();
		CriticalSection.testApproaches(pman1, pman2);
	}
}
