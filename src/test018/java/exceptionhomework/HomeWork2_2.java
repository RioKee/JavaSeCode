package test018.java.exceptionhomework;

public class HomeWork2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(Season.SPRING);  
//		System.out.println(Season.SUMMER);
//		System.out.println(Season.AUTUMN);
//		System.out.println(Season.WINTER);

//		System.out.println("==遍历枚举的值==");
//		for(Season season : Season.values()) {
//			System.out.println(season);
//		}

		Season season = Season.SUMMER;
		switch(season) {
		case SPRING:
			System.out.println("春天");
			break;
		case SUMMER:
			System.out.println("夏天");
			break;
		case AUTUMN:
			System.out.println("秋天");
			break;
		case WINTER:
			System.out.println("冬天");
			break;
		}
		
	}

}
//任务二：
//定义一个季节枚举类，枚举成员只有春、夏、秋、冬。
//实现控制台输入季节，
//符合春天，显示“春暖花开”；
//符合夏天，显示“夏日炎炎”；
//符合秋天，显示“秋高气爽”；
//符合冬天，显示“冬日雪飘”。
