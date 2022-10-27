package test021.java.homework;

public class HomeWork2_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Student stu1 = new Student();
//		Student stu2 = new Student();
		
		Thread zhangsan = new Thread(stu1, "张三");
		Thread lisi = new Thread(stu1, "李四");
		
		zhangsan.setPriority(Thread.MAX_PRIORITY);
		lisi.setPriority(Thread.MIN_PRIORITY);
		
		zhangsan.start();
//		zhangsan.join();
		
		lisi.start();
		
	}

}
/*
 * 任务1：线程优先级
1.1 任务描述
(1)	用实现Runnable接口的方式，定义实现类，类中有的run()方法的功能实现的是输入5遍“好好学习，天天向上”；
(2)	创建两个线程，一个叫“张三”，一个叫“李四”，张三设置优先级为最高，李四设置优先级为最低。
(3)	启动两个线程，看结果。

难点提示
(1)	设置线程优先级使用setPriority方法。
(2)	线程的默认优先级是Thread.NORM_PRIORITY

 * */

class Student implements Runnable{
	
	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			synchronized(this) {
				System.out.println(Thread.currentThread().getName() + "好好学习天天向上");
			}
		}
	}
}
