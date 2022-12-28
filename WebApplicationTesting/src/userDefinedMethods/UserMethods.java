package userDefinedMethods;

public class UserMethods {
public void Test1() {
	System.out.println("Test1 is User-defined method");
	
}
private void Test2() {
	System.out.println("test2 is private user-defined method");
	
}
protected void Test3() {
	System.out.println("Test3 is protected user-defined method");
}
	
	public static void main(String[] args) {
		UserMethods obj=new UserMethods();
		obj.Test1();
		obj.Test2();
		obj.Test3();
				
	}
	
}
