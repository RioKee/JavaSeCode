package test021.java.homework;

public class HomeWork2_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Apple apple = new Apple();
		Thread t1 = new Thread(apple, "张三");
		Thread t2 = new Thread(apple, "李四");
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		
		t1.start();
//		t1.join();
		t2.start();
	}

}
/*
 * 任务2：线程同步：发苹果
2.1 任务描述
（1）中午食堂发苹果，一共有6个苹果，张三和李四每人每次拿一个，各拿三次。
（2）使用同步控制数量的正确；
（3）使用优先级控制尽量让张三先拿完三个，再让李四拿。
难点提示
线程同步
优先级设置
*/

class Apple implements Runnable{
	private int appNum = 6;
	public void share() {
		System.out.println(Thread.currentThread().getName() + appNum--);
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 3; i++) {
			synchronized(this) {
				share();
			}
			
		}
	}
}
