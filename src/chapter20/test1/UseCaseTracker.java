package chapter20.test1;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UseCaseTracker {
	public static void trackUseCases(List<Integer> useCases,Class<?> cl){
		for (Method m : cl.getDeclaredMethods()) {
			//方法1：<T extends Annotation> T getAnnotation(Class<T> annotationClass): 
			//返回改程序元素上存在的、指定类型的注解，如果该类型注解不存在，则返回null。
			UseCase uc = m.getAnnotation(UseCase.class);
			if(uc !=null){
				System.out.println("Found Use Case:"+uc.id()+" "+uc.description());
				useCases.remove(new Integer(uc.id()));
			}
		}
		for (int i : useCases) {
			System.out.println("Warning:Mssing use case-"+i);
		}
	}
	public static void main(String[] args) {
		List<Integer> useCases = new ArrayList<Integer>();
		Collections.addAll(useCases, 47,48,49,50);
		trackUseCases(useCases, PasswordUtils.class);
	}
}
