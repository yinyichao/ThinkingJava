package chapter14.test5;

	class C implements A{
	public void g(){
		System.out.println("public C.g()");
	}
	@Override
	public void f() {
		System.out.println("public C.f()");
	}
	void u(){
		System.out.println("package C.u()");
	}
	protected void v(){
		System.out.println("protected C.v()");
	}
	private void w(){
		System.out.println("private C.w()");
	}
}
