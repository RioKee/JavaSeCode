package test021.java.homework;

public class HomeWork2_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Student stu1 = new Student();
//		Student stu2 = new Student();
		
		Thread zhangsan = new Thread(stu1, "����");
		Thread lisi = new Thread(stu1, "����");
		
		zhangsan.setPriority(Thread.MAX_PRIORITY);
		lisi.setPriority(Thread.MIN_PRIORITY);
		
		zhangsan.start();
//		zhangsan.join();
		
		lisi.start();
		
	}

}
/*
 * ����1���߳����ȼ�
1.1 ��������
(1)	��ʵ��Runnable�ӿڵķ�ʽ������ʵ���࣬�����е�run()�����Ĺ���ʵ�ֵ�������5�顰�ú�ѧϰ���������ϡ���
(2)	���������̣߳�һ���С���������һ���С����ġ��������������ȼ�Ϊ��ߣ������������ȼ�Ϊ��͡�
(3)	���������̣߳��������

�ѵ���ʾ
(1)	�����߳����ȼ�ʹ��setPriority������
(2)	�̵߳�Ĭ�����ȼ���Thread.NORM_PRIORITY

 * */

class Student implements Runnable{
	
	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			synchronized(this) {
				System.out.println(Thread.currentThread().getName() + "�ú�ѧϰ��������");
			}
		}
	}
}
