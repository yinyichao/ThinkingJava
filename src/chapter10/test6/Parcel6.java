package chapter10.test6;

public class Parcel6 {
	private void internalTracking(boolean b){
		if(b){
			class TrackingSlip{
				private String id;
				TrackingSlip(String s){
					id = s;
				}
				String getSlip(){
					return id;
				}
			}
			TrackingSlip ts = new TrackingSlip("slip");
			String s = ts.getSlip();
			System.out.println(s);
		}
		//TrackingSlip类被嵌入if语句作用域内，并不是说该类的创建是有条件的
		//它其实与别的类一起编译过了。然而，在定义TrackingSlip的作用域之外，它是不可用的
		//TrackingSlip ts = new TrackingSlip("slip");
	}
	public void track(){
		internalTracking(true);
	}
	public static void main(String[] args) {
		Parcel6 p = new Parcel6();
		p.track();
	}
}
