package test021.java.homework;

public class HomeWork2_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Apple apple = new Apple();
		Thread t1 = new Thread(apple, "����");
		Thread t2 = new Thread(apple, "����");
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		
		t1.start();
//		t1.join();
		t2.start();
	}

}
/*
 * ����2���߳�ͬ������ƻ��
2.1 ��������
��1������ʳ�÷�ƻ����һ����6��ƻ��������������ÿ��ÿ����һ�����������Ρ�
��2��ʹ��ͬ��������������ȷ��
��3��ʹ�����ȼ����ƾ������������������������������á�
�ѵ���ʾ
�߳�ͬ��
���ȼ�����
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
