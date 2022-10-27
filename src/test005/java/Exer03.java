package test005.java;

public class Exer03 {
	public static void main(String[]args) {
		//完数  真因子之和  除去本身
		for(int i = 1; i <= 10000; i++) {
			//取1000个数
			int sum=0;
			for(int j = 1; j < i; j++) {
				// 去除本身
				if(i%j==0) {
					sum+=j;
				}				
			}
			if(sum==i) {
				System.out.println("完数："+i);
			}
			
		}
		
		
	}
}
