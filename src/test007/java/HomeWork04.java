package test007.java;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork04 {
	public static void main(String[]args) {
	
		//4.���ٿռ�����
		String[] words = {"apple", "banana", "cat", "dog"};
		System.out.println("��ʼ���飺" + Arrays.toString(words));
		while(true){
			System.out.print("�����뵥��:");
			Scanner input = new Scanner(System.in);
			String str = input.next();  //�����Ԫ��
			//�ж��Ƿ���������鵱��
			//���ھ���ʾ���ڣ������ڴ��ھ���ӵ�������
			int index = -1;  // ���Դ洢�ı�־����������ΪԪ���±걣��
			for(int i = 0; i < words.length; i++) {
				if(str.equals(words[i])) {  //�������ǣ������±��ַ
					index = i;
				}
			}
			if(index == -1) {  //Ԫ�ز����ڣ������в���
				System.out.println("Ԫ�ز�����!!!!!!  --->" + Arrays.toString(words));
			}else {
				System.out.print("Ԫ�ش���,��ɾ������Ԫ��====��");
				String [] arr = new String[words.length - 1]; //��С���鳤��
				
				for(int i = 0, k = 0; i < words.length; i++) {  //����words,kÿ�����
					if(i != index) {  
						arr[k] = words[i];
						k++;
					}
				}
				words = arr;
				System.out.println("ɾ��������飺" + Arrays.toString(words));
			}
			//����Ԫ��Ϊ�գ��˳�����
			if(words.length == 0) {
				System.out.println("����Ԫ��Ϊ�գ��˳�����");
				break;
			}
			//�Ƿ����ִ�г���
			System.out.print("�Ƿ�������뵥��  y/n��");
			String option = input.next();
			if(option.equals("y")) {
				System.out.print("�������ִ�С�����");
			}else if(option.equals("n")){
				System.out.println("�˳����򡣡���");
				break;
			}else {
				System.out.print("����û���˳���Ĭ�ϼ���ִ�С�����");
			}
		}
	}
}

