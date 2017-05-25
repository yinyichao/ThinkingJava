package chapter20.test2;
@DBTable(name = "MEMBER")
public class Member {
	//快捷方式：如果程序员的注解中定义了名为value的元素，
	//并且在应用该注解的时候，如果该元素是唯一需要赋值的一个元素，
	//那么此时无需使用名-值对的这种语法，而只需在括号内给出
	//value元素所需的值即可。
	@SQLString(30) String firstName;
	@SQLString(30) String lastName;
	@SQLInteger Integer age;
	@SQLString(value = 30,constraints = @Constraints(primaryKey=true))
	String handle;
	static int memberCount;
	public String getHandle(){
		return handle;
	}
	public String getFirstName(){
		return firstName;
	}
	public String getLastName(){
		return lastName;
	}
	public String toString(){
		return handle;
	}
	public Integer getAge(){
		return age;
	}
}
