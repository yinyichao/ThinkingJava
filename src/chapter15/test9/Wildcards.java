package chapter15.test9;

import chapter15.test8.Holder;

public class Wildcards {
	static void rawArgs(Holder holder,Object arg){
		holder.set(arg);
		holder.set(new Wildcards());
		//T t = holder.get();
		Object obj = holder.get();
	}
	static void unboundedArg(Holder<?>holder,Object arg){
		//holder.set(arg);
		//holder.set(new Wildcards());
		//T t = holder.get();
		Object obj = holder.get();
	}
	static<T> T exact1(Holder<T> holder){
		T t = holder.get();
		return t;
	}
	static<T> T exact2(Holder<T> holder,T arg){
		holder.set(arg);
		T t = holder.get();
		return t;
	}
	static <T> T wildSubtype(Holder<? extends T> holder,T arg){
		//holder.set(arg);
		T t = holder.get();
		return t;
	}
	static <T> void wildSupertype(Holder<? super T> holder,T arg){
		holder.set(arg);
		//T t = holder.get();
		Object obj = holder.get();
	}
	public static void main(String[] args) {
		Holder raw = new Holder<Long>();
		raw = new Holder();
		Holder<Long> qualified = new Holder<Long>();
		Holder<?> unbounded = new Holder<Long>();
		Holder<? extends Long> bounded = new Holder<Long>();
		Long lng = 1L;
		rawArgs(raw, lng);
		rawArgs(qualified, lng);
		rawArgs(unbounded, lng);
		rawArgs(bounded, lng);
		
		unboundedArg(raw, lng);
		unboundedArg(qualified, lng);
		unboundedArg(unbounded, lng);
		unboundedArg(bounded, lng);
		
		Object r1 = exact1(raw);
		try{
			Long r2 = exact1(qualified);
		}catch(Exception e){
			e.printStackTrace();
		}
		Object r3 = exact1(unbounded);
		try{
			Long r4 = exact1(bounded);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		Long r5 = exact2(raw, lng);
		Long r6 = exact2(qualified, lng);
		//Long r7 = exact2(unbounded, lng);
		//Long r8 = exact2(bounded, lng);
		
		Long r9 = wildSubtype(raw, lng);
		Long r10 = wildSubtype(qualified, lng);
		Object r11 = wildSubtype(unbounded, lng);
		try{
			Long r12 = wildSubtype(bounded, lng);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		wildSupertype(raw, lng);
		wildSupertype(qualified, lng);
		//wildSupertype(unbounded, lng);
		//wildSupertype(bounded, lng);
	}
}
