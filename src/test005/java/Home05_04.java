package test005.java;

public class Home05_04 {
	public static void main(String[]args) {
		//鸡兔同笼的问题   36头  78足
		
		for(int x=0;x<=36;x++) {
			if((36-x)>0 && x*2+(36-x)*4==78) {
				System.out.println("鸡有："+x+"\t兔子有："+(36-x));
			}
		}
	}
}
