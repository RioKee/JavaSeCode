package test017.java;

public class Threadexer01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat = new Cat();
		for(int i = 0; i < 10; i++) {
			cat.run();
		}
	}

}
class Cat extends Thread{
	@Override
	public void run() {

		try {
			Thread.sleep(1000);
			System.out.println("nihao");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}