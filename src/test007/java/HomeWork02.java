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
		//输入一个单词，如果存在，不添加  如果没有添加进数组		
		String[] words = {"apple", "banana", "cat", "dog"};
		System.out.println("初始数组：" + Arrays.toString(words));
		
		while(true) {	
			System.out.print("请输入单词:");
			
			Scanner input = new Scanner(System.in);
			String str = input.next();  //输入的元素
			
			//判断是否存在于数组当中
			//存在就提示存在，不存在存在就添加到数组中
			int index = -1;
			for(int i = 0; i < words.length; i++) {
				if(str.equals(words[i])) {
					index = 1;
				}
	
			}
			
			if(index == 1) {
				System.out.println("元素已存在:" + Arrays.toString(words));
			}else {
				System.out.print("元素不存在,将添加到数组中====》");
				String [] arr = new String[words.length + 1];
				for(int i = 0; i < arr.length-1;i++) {
					arr[i] = words[i];
				}
				arr[arr.length-1] = str;
				words = arr;
				System.out.println("添加后的数组：" + Arrays.toString(words));
			}
			
			//是否继续执行程序
			System.out.print("是否继续输入单词  y/n：");
			String option = input.next();
			if(option.equals("y")) {
				System.out.print("程序继续执行。。。");
			}else {
				System.out.println("退出程序。。。");
				break;
			}
		}
		
		
		
	}
}