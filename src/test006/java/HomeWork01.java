package test006.java;

import java.util.Scanner;

public class HomeWork01 {
	public static void main(String[]args) {
		//随机5个数，并输出
		int[] arr1 = new int[5];
		for(int i = 0; i < 5; i++) {
			arr1[i] = (int)(Math.random()*100+1);
		}
		System.out.print("随机生成的5个数：");
		for(int j = 0; j < 5; j++) {
			System.out.print(arr1[j] + " ");
		}
		
		
		// 输入一个单词  判断元素是否在数组里面
		//String[] words = {"apple", "banana", "car", "dog"};
		String[] words = {"apple", "banana", "car", "dog"};
		System.out.println("\"apple\", \"banana\", \"car\", \"dog\"");
		System.out.print("请输入单词：");
		Scanner input = new Scanner(System.in);
		String str = input.next();
		
		//开关，判断是否存在
		boolean type = false;
		
		for(int i = 0; i < words.length; i++) {
			if(str.equals(words[i])) { 
				type = true;
			}
		}
		
		//判断输出元素是否存在
		if(type) {
			System.out.println(str + "存在");
		}else {
			System.out.println(str + "不存在");
		}
	}
}
