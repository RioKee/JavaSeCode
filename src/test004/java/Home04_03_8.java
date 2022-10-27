package test004.java;

public class Home04_03_8 {
	public static void main(String[]args) {
		//输出100之间的偶数和  奇数和
//		int sum=0;
//		int i=0;
//		while(i<=100) {
//			if(i%2==0)
//				sum=sum+i;
//			i++;
//		}
//		System.out.println("偶数的和："+sum);
		
		
		//输出100以内的奇数和
//		int sum=0;
//		int i=0;
//		while(i<=100) {
//			if(i%2!=0) {
//				sum+=i;
//			}
//			i++;
//		}
//		System.out.println("奇数和："+sum);
		
		//9、输入5名学生成绩，计算总成绩和平均分
//		int i=1;
//		int sum=0;
//		while(i<6) {
//			System.out.print("请第"+i+"位同学输入成绩：");
//			int num=new java.util.Scanner(System.in).nextInt();
//			sum+=num;
//			i++;
//		}
//		System.out.println("总成绩："+sum);
//		System.out.println("平均分："+(sum/5));
		
		//10、总共10000人，每年增长2%, 一共增长7次
//		int i=7;
//		int sum=10000;
//		while(i>0) {
//			sum*=1.02;
//			i--;
//		}
//		System.out.println("第二期最后一年总人数："+sum);
		
		/*
		 * 11 遇到7避过
		 *      数字出现7  闭嘴
		 * 7的倍数输出蹲下
		 * 特殊情况  7 77  怎么处理   同时走两个分支，所以必须用if
		 * */
//		for(int i=1;i<=100;i++) {
//			boolean type=true;
//			if(i%7==0) {  //7的倍数
//				System.out.print("蹲下");
//				type=false;
//			}
//			if(i%10==7 || i/10%10==7) {  //个位上遇到7  十位上遇到7
//				System.out.print("闭嘴");
//				type=false;
//			}
//			if(type) {
//				System.out.println(i);
//			}else {
//				System.out.println();
//			}
//		
//		}
		
		// 自定义菜单
		
		
		while(true) {
			System.out.println("===学生管理系统===\n"
					+ "1、保存学生信息 \n"
					+ "2、读取学生信息 \n"
					+ "3、学生成绩排行榜\n"
					+ "4、修改指定学生信息\n"
					+ "5、删除指定学生信息 \n"
					+ "6、退出程序 \n"
					+ "请输入菜单编号:");
			String num=new java.util.Scanner(System.in).nextLine();
			switch(num) {
				case "1":
					System.out.println("保存学生信息");
					String action1=new java.util.Scanner(System.in).nextLine();
					if(action1.equals("save")) {
						System.out.println("保存学生信息完成");
					}else {
						System.out.println("输入有误，返回上一级菜单");
					}
					continue;
				case "2":
					System.out.println("读取学生信息");
					String action2=new java.util.Scanner(System.in).nextLine();
					if(action2.equals("load")) {
						System.out.println("读取学生信息完成");
					}else {
						System.out.println("输入有误，返回上一级菜单");
					}
					continue;
				case "3":
				case "show":
					System.out.println("学生信息排行榜");
					continue;
				case "4":
					System.out.println("修改指定学生信息");
					
					continue;
				case "5":
					System.out.println("删除指定学生信息");
					continue;
				case "6":
				case "exit":
					System.out.println("退出程序");
					break;
				default:
					System.out.println("输入错误！！请重新输入：");
					System.out.println("学生管理系统\n"
							+ "1、保存学生信息 \n"
							+ "2、读取学生信息 \n"
							+ "3、学生成绩排行榜\n"
							+ "4、修改指定学生信息\n"
							+ "5、删除指定学生信息 \n"
							+ "6、退出程序 \n"
							+ "请输入菜单编号:");
					continue;
			}
			break;
		}
		
		
	}
}
