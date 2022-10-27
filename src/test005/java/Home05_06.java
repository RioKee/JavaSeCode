package test005.java;

public class Home05_06 {

}

class Game01{
	public static void main(String[]args) {
		//左轮游戏   生成随机数   从第一轮开始，一共六轮
		int ran = (int)(Math.random()*6+1);
		System.out.println(ran);
		
		System.out.println("==欢迎来到转盘游戏==");
		System.out.print("请P1玩家输入姓名：");
		String p1 = new java.util.Scanner(System.in).nextLine();
 		System.out.print("请P2玩家输入姓名：");
 		String p2 = new java.util.Scanner(System.in).nextLine();
 		
 		System.out.println(p1 + "玩家 --PK--" + p2 + "玩家");
 		System.out.println("==戏游戏开始==");
 		boolean type=true;
 		int i = 1;
 		while(i <= 6){
// 			System.out.println("第"+i+"轮游戏开始");
 			if(i == ran) {
 				System.out.println("第"+i+"枪响了！"+p1+"玩家死亡");
 				type=false;
 				break;
 			}
 			System.out.println("第" + i + "枪没响" + p1 + "玩家暂时存活");
 			i++;
 			if(i == ran) {
 				System.out.println("第" + i + "枪响了！" + p2 + "玩家死亡");
 				break;
 			}
 			System.out.println("第" + i + "枪没响" + p2 + "玩家暂时存活");
 			i++; 
 		}
 		if(type) {
 			System.out.println(p1 + "玩家存活，逍遥自在");
 		}else {
 			System.out.println(p2 + "玩家存活，逍遥自在");
 		}
 		
 		
	}
}

class Game02{
	public static void main(String[]args) {
		
		//积分初始化
		int perScore = 0;
		int comScore = 0;
		
		//进入游戏   //退出游戏
		System.out.println("游戏开始，选项如下：1、剪刀；2、石头；3、布   【 6退出游戏】");
		
		//请输入角色   小明   小李 
		System.out.print("请输入你的姓名：");
		String p = new java.util.Scanner(System.in).nextLine();
		System.out.println(p + "玩家 --PK--" + "电脑玩家");
 		System.out.println("==戏游戏开始==");
		
		while(true) {
			
			//剪刀石头布    1、剪刀；2、石头；3、布
			//和电脑随机进行游戏    行为编号1 2 3  电脑随机生成 1~3的数字
			int comNum = (int)(Math.random()*3+1);
//			System.out.println("电脑随机数："+comNum);
			
			//请玩家输入你选择的编号
			System.out.print("请" + p + "玩家输入你的选择：");
			int pNum = new java.util.Scanner(System.in).nextInt();
			
			//平局只需写一个判断，优化代码			
			if(pNum==comNum) {
				System.out.println("平局");
			}else if(pNum==1 && comNum==2) {
				System.out.println("剪刀PK石头，电脑获胜");
				comScore++;
			}else if(pNum==1 && comNum==3) {
				System.out.println("剪刀PK布，【玩家】获胜");
				perScore++;
			}else if(pNum==2 && comNum==1) {
				System.out.println("石头PK剪刀，【玩家】获胜");
				perScore++;
			}else if(pNum==2 && comNum==3) {
				System.out.println("石头PK布，电脑获胜");
				comScore++;
			}else if(pNum==3 && comNum==1) {
				System.out.println("布PK剪刀，电脑获胜");
				comScore++;
			}else if(pNum==3 && comNum==2) {
				System.out.println("布PK石头，【玩家】获胜");
				perScore++;
			}else if(pNum==6) {	 //退出游戏			
				break;
			}else {
				System.out.println("输入错误！！！   请重新输入");
				continue;
			}		
		}
		System.out.println("===最终积分===");
		System.out.println("玩家" + p + ":" + perScore + "\t电脑:" + comScore);
	}
}