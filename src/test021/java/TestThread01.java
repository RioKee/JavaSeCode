package test021.java;

public class TestThread01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReadWriteNum.test();
	}

}
/*
 * * 4．随机生成5个[10~99]的数字放在数组中；两个线程类分别读数据、写数据。
* 提示：
* 1、新建int [] numbres=new int[5];数组，随机生成五次范围内数字放在numbers数组中。
* 2、一个线程类调用输出数组中所有元素的方法；
* 3、一个线程类调用随机生成五个数字的方法；
* 4、要保证多线程同时运行环境下，数据读写的正确性和安全性；
 * */

class ReadWriteNum{
	int [] numbers=new int[5];

	class Write extends Thread{
		public void write() {
			for(int i = 0; i < numbers.length; i++) {
				int n = (int)(Math.random()*90+10);
				numbers[i] = n;
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		@Override
		public void run() {
			write();
		}
	}
	class Read extends Thread{
		
		public void read() {
			for(int i = 0; i < numbers.length; i++) {
				System.out.println("索引为" + i +" 的值为：" + numbers[i]);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		@Override
		public void run() {
			read();
		}
	}
	
	public static void test() {
		ReadWriteNum rw = new ReadWriteNum();
		Write write = rw.new Write();
		Read read = rw.new Read();
		write.start();
		read.start();
	}
	
}