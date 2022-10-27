package test004.java;

public class Home04_04 {
	public static void main(String[]args) {
		//100~999的水仙花数
		//每一位上的数字三次方，等于本身
//		int i=100;
//		while(i<999) {
//			int a=i%10;
//			int b=i/10%10;
//			int c=i/10/10;
//			if(i==a*a*a+b*b*b+c*c*c) {
//				System.out.println("水仙花数："+i);
//			}
//			i++;
//		}
		
		//输入5个数，找出最大的数，最小的数
		//不定义初始值，将接收的第一个数开辟内存空间并存放数据
		System.out.println("请输入第1个数：");
		int numMax=new java.util.Scanner(System.in).nextInt();  
		int numMin=numMax;
		for(int i=2;i<=5;i++) {
			System.out.println("请输入第"+i+"个数：");
			int num=new java.util.Scanner(System.in).nextInt();
			if(numMax<num) {
				numMax=num;
			}
			if(numMin>num) {
				numMin=num;
			}
		}
		System.out.println("最大的数："+numMax);
		System.out.println("最小的数："+numMin);
		
		
		
		//采用数组冒牌排序来
	}
}
