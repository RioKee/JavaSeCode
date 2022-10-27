package test020.java;

public class ListExer01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer s = new Integer(9);
		Integer u = new Integer(9);
		
		System.out.println(s.equals(u));
		new OuterTest().test();
		
	}

}

class OuterTest{
	private int[] numbers = new int[5];	
	class Write extends Thread{
		@Override
		public void run() {
			for(int i = 0; i < numbers.length; i++) {
				numbers[i] = (int)(Math.random()*(100-10) + 10);
				System.out.println(Thread.currentThread().getName() + "写入的数据，下标" + i +"为：" + numbers[i]);
				try {
					Thread.sleep(1000);
				}catch(Exception e) {
					e.printStackTrace();
				}				
			}
		}		
	}	
	class Read extends Thread{
		@Override
		public void run() {
			for(int i = 0; i < numbers.length; i++) {
				System.out.println(Thread.currentThread().getName() + "读取的数据，下标" + i +"为：" + numbers[i]);
				try {
					Thread.sleep(1000);
				}catch(Exception e) {
					e.printStackTrace();
				}				
			}
		}		
	}	
	public void test() {
		OuterTest outerTest = new OuterTest();
		Write write = outerTest.new Write();
		Read read = outerTest.new Read();
		write.setName("写线程");
		write.start();
		
		read.setName("读线程");
		read.start();		
	}	
}