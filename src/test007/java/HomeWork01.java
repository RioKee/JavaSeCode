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
	//1.随机5个数，升序排列
	public void homeWork01(){
		int[] arr = new int[10];
		//存放数组元素
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*100+1);
		}
		//升序，进行循环
		int temp = 0;
		for(int i = 0; i < arr.length - 1; i++) { //外层控制
			for(int j = 0; j < arr.length - 1 - i; j++) {  //内存比较相邻的两个值
				if(arr[j] > arr [j+1]) {    //升序，将大的值往后交换移动
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}
	
	//2.随机5个数，降序排列
	public void homeWork02(){
		int[] arr = new int[10];
		//存放数组元素
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*100+1);
		}
		//升序，进行循环
		int temp = 0;
		for(int i = 0; i < arr.length - 1; i++) { //外层控制
			for(int j = 0; j < arr.length - 1 - i; j++) {  //内存比较相邻的两个值
				if(arr[j] < arr [j+1]) {    //降序，将小的值往后交换移动
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
	
}