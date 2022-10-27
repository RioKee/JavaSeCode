package test005.java;

public class Home05_01 {
	public static void main(String[]args) {
		//1、输入5名学员成绩到数组，显示所有成绩，总成绩，平均成绩
		int [] array=new int[5];
		int sum=0;
		for(int i=0;i<5;i++) {
			System.out.print("请输入数字：");
			array[i]=new java.util.Scanner(System.in).nextInt();
		}
		System.out.print("所有成绩：");
		for (int i : array) {
			sum+=i;
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("总成绩："+sum);
		System.out.println("平均成绩："+sum/5);
	}
}
