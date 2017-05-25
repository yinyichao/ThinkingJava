package chapter20.test2;

public @interface Uniqueness {
	Constraints constraints() default @Constraints(unique=true);
}
