package test019.java;

class Base{
	public void f1() {
		System.out.println("Base");
	}
}

public class InnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Base() {
			@Override
			public void f1() {
				System.out.println("Sub");
			}
		}.f1();
	}

}
