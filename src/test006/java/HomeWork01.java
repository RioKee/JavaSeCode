package test006.java;

import java.util.Scanner;

public class HomeWork01 {
	public static void main(String[]args) {
		//���5�����������
		int[] arr1 = new int[5];
		for(int i = 0; i < 5; i++) {
			arr1[i] = (int)(Math.random()*100+1);
		}
		System.out.print("������ɵ�5������");
		for(int j = 0; j < 5; j++) {
			System.out.print(arr1[j] + " ");
		}
		
		
		// ����һ������  �ж�Ԫ���Ƿ�����������
		//String[] words = {"apple", "banana", "car", "dog"};
		String[] words = {"apple", "banana", "car", "dog"};
		System.out.println("\"apple\", \"banana\", \"car\", \"dog\"");
		System.out.print("�����뵥�ʣ�");
		Scanner input = new Scanner(System.in);
		String str = input.next();
		
		//���أ��ж��Ƿ����
		boolean type = false;
		
		for(int i = 0; i < words.length; i++) {
			if(str.equals(words[i])) { 
				type = true;
			}
		}
		
		//�ж����Ԫ���Ƿ����
		if(type) {
			System.out.println(str + "����");
		}else {
			System.out.println(str + "������");
		}
	}
}
