package test005.java;

public class Home05_05 {
	public static void main(String[]args) {
		//输入5名学员成绩，成绩排序，使用以为数组
		int []score=new int[5];
		int temp;
		for(int i=0;i<5;i++) {
			System.out.println("请第"+i+"位同学输入成绩：");
			score[i]=new java.util.Scanner(System.in).nextInt();
		}
		for(int i=0;i<score.length;i++) {
			for(int j=1;j<score.length-i;j++) {
				if(score[i]<score[j]) {
					temp=score[j];
					score[j]=score[i];
					score[i]=temp;
				}
			}
		}
		for (int i : score) {
			System.out.println(i+" ");
		}
	}
}
