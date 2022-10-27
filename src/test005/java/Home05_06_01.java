package test005.java;

import java.util.Scanner;

public class Home05_06_01 {
	public static void main(String[]args) {
		//利用switch 分支  和   三木运算符来判断最终结果
		
		//游戏开始
		System.out.println("1、剪刀；2、石头；3、布   ");
		
		//剪刀石头布    1、剪刀；2、石头；3、布
		//和电脑随机进行游戏    行为编号1 2 3  电脑随机生成 1~3的数字
		int comNum = (int)(Math.random()*3+1);
		System.out.println("电脑随机数："+comNum);
		
		//玩家操作
		System.out.print("请选择你的操作:");
		int choice = new Scanner(System.in).nextInt();
		
		String opt = "";
		switch(choice) {
			case 1 : 
				opt = comNum == 1 ? "平局" : (comNum == 2 ? "你输了！" : "你赢了！");
				break;
			case 2 :
				opt = comNum == 2 ? "平局" : (comNum == 2 ? "你输了！" : "你赢了！");
				break;
			case 3 :
				opt = comNum == 2 ? "平局" : (comNum == 2 ? "你输了！" : "你赢了！");
				break;
			default:
				System.out.println("输入异常");
				break;
		}
		System.out.println(opt);
		
		
		
	}

}
