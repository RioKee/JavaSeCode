package test007.java;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork04 {
	public static void main(String[]args) {
	
		//4.减少空间数组
		String[] words = {"apple", "banana", "cat", "dog"};
		System.out.println("初始数组：" + Arrays.toString(words));
		while(true){
			System.out.print("请输入单词:");
			Scanner input = new Scanner(System.in);
			String str = input.next();  //输入的元素
			//判断是否存在于数组当中
			//存在就提示存在，不存在存在就添加到数组中
			int index = -1;  // 可以存储的标志，还可以作为元素下标保存
			for(int i = 0; i < words.length; i++) {
				if(str.equals(words[i])) {  //当存在是，保存下标地址
					index = i;
				}
			}
			if(index == -1) {  //元素不存在，不进行操作
				System.out.println("元素不存在!!!!!!  --->" + Arrays.toString(words));
			}else {
				System.out.print("元素存在,将删除输入元素====》");
				String [] arr = new String[words.length - 1]; //缩小数组长度
				
				for(int i = 0, k = 0; i < words.length; i++) {  //遍历words,k每次相加
					if(i != index) {  
						arr[k] = words[i];
						k++;
					}
				}
				words = arr;
				System.out.println("删除后的数组：" + Arrays.toString(words));
			}
			//数组元素为空，退出程序
			if(words.length == 0) {
				System.out.println("数组元素为空，退出程序");
				break;
			}
			//是否继续执行程序
			System.out.print("是否继续输入单词  y/n：");
			String option = input.next();
			if(option.equals("y")) {
				System.out.print("程序继续执行。。。");
			}else if(option.equals("n")){
				System.out.println("退出程序。。。");
				break;
			}else {
				System.out.print("程序没有退出，默认继续执行。。。");
			}
		}
	}
}

