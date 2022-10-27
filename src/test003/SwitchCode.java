package test003;

import java.util.Scanner;

public class SwitchCode {
	public static void main(String[]args) {
//		Scanner input=new.Scanner(System.in)
//		
		//一行命令完成对输入的设定
//		int num=new Scanner(System.in).nextInt();
//		System.out.println(num);
		
		/*考试等级划分，分析题目，其中包含多分支判断，只能用IF判断*/
		
//		Scanner input=new Scanner(System.in);
//		System.out.println("请输入成绩");
//		int score=input.nextInt();
//		if(score>90 && score<=100) {
//			System.out.println("成绩为A");
//		}
//		if(score>80 && score<=90) {
//			System.out.println("成绩为B");
//		}
//		if(score>70 && score<=80) {
//			System.out.println("成绩为C");
//		}
//		if(score>=60 && score<=70) {
//			System.out.println("成绩为D");
//		}
//		if(score>=0 && score<60) {
//			System.out.println("成绩为E");
//		}
		
		//打印等腰三角形
//		for(int i=1;i<=5;i++) {
//			for(int k=1;k<=5-i;k++) {
//				System.out.print(" ");
//			}
//			for(int j=1;j<=i*2-1;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
		/*输入一个字符串，输出字符串的unicode编码总和*/
		
		
		
		/*输入一个数字判断是奇数还是偶数*/
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("请输入一个数：");
		int num=input.nextInt();
		// 偶数的条件，能被2整除，余数等于0   0也是偶数
		if(num%2==0 || num==0) {
			System.out.println(num+"为偶数");
		}else {
			System.out.println(num+"为奇数");
		}
		
		
		
	}

}
