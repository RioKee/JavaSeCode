package test007.java;

import java.util.Arrays;

public class HomeWork01 {
	public static void main(String[]args) {
		HomeWork h = new HomeWork();
		
		h.homeWork01();
		h.homeWork02();
	}
	
}

class HomeWork{
	//1.���5��������������
	public void homeWork01(){
		int[] arr = new int[10];
		//�������Ԫ��
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*100+1);
		}
		//���򣬽���ѭ��
		int temp = 0;
		for(int i = 0; i < arr.length - 1; i++) { //������
			for(int j = 0; j < arr.length - 1 - i; j++) {  //�ڴ�Ƚ����ڵ�����ֵ
				if(arr[j] > arr [j+1]) {    //���򣬽����ֵ���󽻻��ƶ�
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}
	
	//2.���5��������������
	public void homeWork02(){
		int[] arr = new int[10];
		//�������Ԫ��
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*100+1);
		}
		//���򣬽���ѭ��
		int temp = 0;
		for(int i = 0; i < arr.length - 1; i++) { //������
			for(int j = 0; j < arr.length - 1 - i; j++) {  //�ڴ�Ƚ����ڵ�����ֵ
				if(arr[j] < arr [j+1]) {    //���򣬽�С��ֵ���󽻻��ƶ�
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
	
}