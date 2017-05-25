package chapter20.test2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 在@Target注解中指定的每一个ElementType就是一个
 * 约束，它告诉编译器，这个自定义的注解只能应用于该类型
 * 程序员可以只指定enum ElementType中的某一个值，
 * 或者以逗号分隔的形式指定多个值。如果想要将注解应用于
 * 所有的ElementType，那么可以省去@Target元注解
 * @author yins
 *
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface DBTable {
	public String name() default "";
}
