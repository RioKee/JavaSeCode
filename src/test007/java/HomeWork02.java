package test007.java;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork02 {
	public static void main(String[]args) {
		
		HomeWorkB h = new HomeWorkB();
		
		h.home03();
		
	}
}

class HomeWorkB{
	
	public void home03() {
		//����һ�����ʣ�������ڣ������  ���û����ӽ�����		
		String[] words = {"apple", "banana", "cat", "dog"};
		System.out.println("��ʼ���飺" + Arrays.toString(words));
		
		while(true) {	
			System.out.print("�����뵥��:");
			
			Scanner input = new Scanner(System.in);
			String str = input.next();  //�����Ԫ��
			
			//�ж��Ƿ���������鵱��
			//���ھ���ʾ���ڣ������ڴ��ھ���ӵ�������
			int index = -1;
			for(int i = 0; i < words.length; i++) {
				if(str.equals(words[i])) {
					index = 1;
				}
	
			}
			
			if(index == 1) {
				System.out.println("Ԫ���Ѵ���:" + Arrays.toString(words));
			}else {
				System.out.print("Ԫ�ز�����,����ӵ�������====��");
				String [] arr = new String[words.length + 1];
				for(int i = 0; i < arr.length-1;i++) {
					arr[i] = words[i];
				}
				arr[arr.length-1] = str;
				words = arr;
				System.out.println("��Ӻ�����飺" + Arrays.toString(words));
			}
			
			//�Ƿ����ִ�г���
			System.out.print("�Ƿ�������뵥��  y/n��");
			String option = input.next();
			if(option.equals("y")) {
				System.out.print("�������ִ�С�����");
			}else {
				System.out.println("�˳����򡣡���");
				break;
			}
		}
		
		
		
	}
}