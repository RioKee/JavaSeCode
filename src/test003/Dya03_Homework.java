package test003;

import java.util.Scanner;

public class Dya03_Homework {
	public static void main(String[]args) {
		//第二天  15题
		/*
		 * 500下绿色
		 * 500以上红色
		 * */
//		System.out.print("请输入重量：");
//		Scanner input=new Scanner(System.in);   //建立扫描
//		int num=input.nextInt();				//存储输入的值
//		if(num>0 && num<=500) {					//判断输入的是否超出范围
//			System.out.println("绿灯亮");			//根据判断输出结果
//		}else {
//			System.out.println("红灯亮");
//		}
		
//		第二天  16题 建筑师测量面积
//		 题目解析   底层长宽 58 33
//		    		  需要输入层数   长  宽
//		Scanner input=new Scanner(System.in);
//		System.out.print("请输入层数");
//		int num=input.nextInt();  //层数
//		
//		System.out.print("请输入宽：");
//		int a=input.nextInt();
//		System.out.print("请输入长：");
//		int b=input.nextInt();
//		
//		int sum=(58*33)+(num*a*b);
//		System.out.println("建筑面积总和："+sum);
		
		
		//day3  第4题
		//角色战力等级分布
//		Scanner input=new Scanner(System.in);
//		System.out.print("请输入你的战力：");
//		int num=input.nextInt();
//		
//		if(num>0 && num<=1000) {
//			System.out.println("☆");
//		}
//		if(num>1000 && num<=2500) {
//			System.out.println("☆☆");
//		}
//		if(num>2500 && num<=5000) {
//			System.out.println("☆☆☆");
//		}
//		if(num>5000 && num<=10000) {
//			System.out.println("☆☆☆☆");
//		}
//		if(num>10000 && num<=20000) {
//			System.out.println("☆☆☆☆☆");
//		}
//		if(num>20000) {
//			System.out.println("☆☆☆☆☆☆");
//		}
		
		
		/*第9题目理解
		 *  一共有5中皮肤选择，每种皮肤有自己对应的加成
		 *  先输入原始战力，  》》》再经过皮肤加成》》》输出加成后的战力
		 * 
		 * */
//		while(true) {
			System.out.println("=======欢迎来到【皮肤战力加成系统】=========");
			System.out.println("1、活动赠送皮肤");
			System.out.println("2、游戏币购买皮肤");
			System.out.println("3、任务奖励皮肤");
			System.out.println("4、重置赠送皮肤");
			System.out.println("5、重置购买皮肤");
			
			Scanner input=new Scanner(System.in);
			System.out.print("请输入你的战力：");			
			int num=input.nextInt();
			
			System.out.print("请选择穿戴皮肤的类型：");
			int option=input.nextInt();
			
			if(option==1){
				num*=1.02;
				System.out.print("活动赠送皮肤加成：↑");
			}
			if(option==2){
				num*=1.04;
				System.out.print("游戏币购买皮肤加成：↑");
			}
			if(option==3){
				num*=1.04;
				System.out.print("任务奖励皮肤加成：↑");
			}
			if(option==4){
				num*=1.08;
				System.out.print("充值赠送皮肤加成：↑");
			}
			if(option==5){
				num*=1.16;
				System.out.print("充值币购买皮肤加成：↑");
			}
			
			System.out.print("  加成后战斗数值为："+num+"  星级为：");
			//战力数值判断	
			if(num>0 && num<=1000) {
				System.out.println("☆");
			}
			if(num>1000 && num<=2500) {
				System.out.println("☆☆");
			}
			if(num>2500 && num<=5000) {
				System.out.println("☆☆☆");
			}
			if(num>5000 && num<=10000) {
				System.out.println("☆☆☆☆");
			}
			if(num>10000 && num<=20000) {
				System.out.println("☆☆☆☆☆");
			}
			if(num>20000) {
				System.out.println("☆☆☆☆☆☆");
			}
			
			
					
//		}
		
		
		
		
		
		
		
		
		
	}

}
