package test017.java.homework;

public class HomeWork02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String color = "green";
		
		try {
			if(!(color.equals("red") || color.equals("yellow") || 
				color.equals("blue"))) 
				throw new ColorException();
			
		}catch(ColorException e) {
			System.out.println(e);
		}
		System.out.println(color);
	}

}
class ColorException extends Exception{
	
	private String message = "颜色只能是 红 黄 蓝";
//	public ColorException(String exception) {
//		this.message = exception;
//	}
	
	public String getMessage() {
		return message;
	}
	
	@Override
	public String toString() {
		return "颜色只能是 红 黄 蓝";
	}
}