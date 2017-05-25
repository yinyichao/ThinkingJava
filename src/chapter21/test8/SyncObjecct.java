package chapter21.test8;

public class SyncObjecct {
	public static void main(String[] args) {
		final DualSynch ds = new DualSynch();
		new Thread(){
			@Override
			public void run() {
				ds.f();
			}
		}.start();
		ds.g();
	}
}
