package test002;

public class Day02_13 {
	public static void main(String[]args) {
//		int a,b,c;
//		a=10;b=20;c=30;
////		System.out.println(a,b,c);
//		System.out.println(a);
//		System.out.println(1+1+"1");
//		
		
//		int a = 1; 
//		int b = 10; 
//		a+=b+=a+=b; 
//		System.out.println(a + " " + b); 
		
		String left="方块5";		//定义魔术师左手的牌
		String right="黑桃8";		//定义魔术师右手的牌
		String box="";		//定义一个中间存放变量
		System.out.println("交换前");
		System.out.println("魔术师左手的牌："+left+"\t\t魔术师右手的牌："+right);
		box=right;  //存右手的牌
		right=left; //将左右的牌给
		left=box;	//将存放右手的牌放到左手
		System.out.println("交换后");
		System.out.println("魔术师左手的牌："+left+"\t\t魔术师右手的牌："+right);
	
				
	}

}
