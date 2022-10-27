package test018.java.exceptionhomework;

public class HomeWork02 {

	public static void main(String[] args){
		// TODO Auto-generated method stub	
		String color1 = "red";
		String color2 = "blue";
		String color3 = "green";
		String color = color3;
		
		try {
			if(!(color.equals("red") || color.equals("blue") || 
					color.equals("yellow"))) {
				throw new ColorException("颜色只能是红、黄、蓝");
			}
			System.out.println(color);
		}catch(ColorException e) {

			e.printStackTrace();
		}

	}

}

//2.	在测试类中使用try-catch捕获并处理异常
//任务二：
//自定义异常ColorException，重写toString()，颜色只能是红、黄、蓝，并测试。
class ColorException extends Exception{
	
	public ColorException(String message) {
		super(message);
	}	
	public String toString() {
		return super.getMessage();
	}
}