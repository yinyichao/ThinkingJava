package chapter10.test9;

public class MNA {
	private void f(){
		
	}
	class A{
		private void g(){
			
		}
		public class B{
			void h(){
				g();
				f();
			}
		}
	}
}
