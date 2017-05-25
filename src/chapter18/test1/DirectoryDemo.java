package chapter18.test1;

public class DirectoryDemo {
	public static void main(String[] args) {
		PPrint.pprint(Directory.walk(".").dirs);
	}
}
