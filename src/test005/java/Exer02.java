package test005.java;

public class Exer02 {
	public static void main(String[]args) {
		//  ´Ó1+2+3+4+5   .....+100=5050;
//		int num1=1;
//		int num=2;
//		int sum=0;
//		System.out.print(num1);
//		while(num<=100) {
//			System.out.print("+"+num);
//			sum+=num;
//			num++;
//		}
////		sum=sum+1;
//		System.out.println("="+(sum+num1));
		
		int sum=0;
		for(int i = 1; i <= 100; i++) {
			
			sum+=i;
			if(i!=100) {
				System.out.print(i+"+");
			}else {
				System.out.print(i);
			}
			
		}
		System.out.println("="+sum);
	
	
	}
}
