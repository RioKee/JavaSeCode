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
				throw new ColorException("��ɫֻ���Ǻ졢�ơ���");
			}
			System.out.println(color);
		}catch(ColorException e) {

			e.printStackTrace();
		}

	}

}

//2.	�ڲ�������ʹ��try-catch���񲢴����쳣
//�������
//�Զ����쳣ColorException����дtoString()����ɫֻ���Ǻ졢�ơ����������ԡ�
class ColorException extends Exception{
	
	public ColorException(String message) {
		super(message);
	}	
	public String toString() {
		return super.getMessage();
	}
}