package test021.java;

public class TestThread01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReadWriteNum.test();
	}

}
/*
 * * 4���������5��[10~99]�����ַ��������У������߳���ֱ�����ݡ�д���ݡ�
* ��ʾ��
* 1���½�int [] numbres=new int[5];���飬���������η�Χ�����ַ���numbers�����С�
* 2��һ���߳�������������������Ԫ�صķ�����
* 3��һ���߳�������������������ֵķ�����
* 4��Ҫ��֤���߳�ͬʱ���л����£����ݶ�д����ȷ�ԺͰ�ȫ�ԣ�
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
				System.out.println("����Ϊ" + i +" ��ֵΪ��" + numbers[i]);
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