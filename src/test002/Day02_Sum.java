package test002;

public class Day02_Sum {
	public static void main(String[]args) {
		int num=1234;
		int a,b,c,d;
		a=num/1000;
		b=num/100%10;
		c=num/10%10;
		d=num%10;

//		System.out.print(d);
//		System.out.print(c);
//		System.out.print(b);
//		System.out.println(a);
		
		String str_a=String.valueOf(a);
		String str_b=String.valueOf(b);
		String str_c=String.valueOf(c);
		String str_d=String.valueOf(d);
		
		
		System.out.println(str_d+str_c+str_b+str_a);
		
		System.out.println(a+b+c+d);			
	}
}
