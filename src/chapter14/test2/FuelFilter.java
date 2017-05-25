package chapter14.test2;

public class FuelFilter extends Filter{
	public static class Factory implements chapter14.test2.Factory<FuelFilter>{
		@Override
		public FuelFilter create() {
			return new FuelFilter();
		}
		
	}
}
