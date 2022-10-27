package test004.java;

public class Day04_1 {
	public static void main(String[]args) {
		/*
		 * 饭店：一周的特价菜
		 * 		周一,周二    水煮鱼  7折
		 * 		周三，周四   鱼香肉丝  7折
		 * 		周五，周六   四喜丸子  7折
		 * 		周日    啤酒免费
		 * 输入星期数字，显示特价菜
		 */
		System.out.println("饭店：一周的特价菜\r\n" + 
				"*周一,周二    水煮鱼  7折\r\n" + 
				"*周三，周四   鱼香肉丝  7折\r\n" + 
				"*周五，周六   四喜丸子  7折\r\n" + 
				"*周日    啤酒免费");
		System.out.print("请选择星期：");
		int num=new java.util.Scanner(System.in).nextInt();
		switch(num) {
			case 1:				
			case 2:
				System.out.println("水煮鱼  7折");
				break;
			case 3:
			case 4:
				System.out.println("鱼香肉丝  7折");
				break;
			case 5:
			case 6:
				System.out.println("四喜丸子  7");
				break;
			case 7:
				System.out.println("啤酒免费");
				break;
			default:
				System.out.println("输入错误");
				break;
		}
		
	}

}
