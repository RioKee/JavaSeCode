package test005.java;

public class Exer01 {
	public static void main(String[]args) {
		// 一个学校  三个年级  
		//每个年级三个班  每个班 5个学生  
		//平均分 
		
		//年级  班 学生
		
		for(int i = 1; i <= 3; i++) {  //三个年级
			for(int j = 1; j <= 3; j++) { //三个班级
				int sum=0;
				for(int k = 1; k <= 5; k++) {
					System.out.print(i+"年"+j+"班"+"第"+k+"位同学" );
					int score=new java.util.Scanner(System.in).nextInt();
					sum+=score;
				}
				System.out.println("=="+i+"年"+j+"班"+"平均成绩为"+sum/5);
				
			}
		}
		
		
	}
}
