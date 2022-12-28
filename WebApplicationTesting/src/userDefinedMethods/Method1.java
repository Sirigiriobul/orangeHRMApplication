package userDefinedMethods;



public class Method1 {

	public void addittion() {
		int a=1;
		int b=2;
		int c;
		c=a+b;
		System.out.println("Addittion is :"+c);
	}
	public void subtraction () {
		
		int z=2;
		int y=1;
		int x;
		x=z-y;
		System.out.println("Subtraction :"+x);
	}
	
	public static void main(String[] args) {
		Method1 meth=new Method1();
		meth.addittion();
		meth.subtraction();
				
	}
	
}
