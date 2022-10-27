package test005.java;

public class Home05_02 {
	public static void main(String[]args) {
		//三个班级，5名学生 成绩   显示各个班的总成绩，平均成绩
		//外层三次循环  内层5此循环  输入的同时比进行总和的相加

		int sum=0;
		for(int i=1;i<=3;i++) {
			System.out.println("请输入第"+i+"个班级成绩");
			for(int j=1;j<=5;j++) {
				System.out.print("第"+j+"位同学：");
				sum+=new java.util.Scanner(System.in).nextInt();
			}
			System.out.println("第"+i+"个班级总成绩："+sum+"\t平均成绩为："+sum/5);			
		}
		
	
	
	}
	

}
