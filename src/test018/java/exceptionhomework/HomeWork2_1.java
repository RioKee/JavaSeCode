package test018.java.exceptionhomework;

public class HomeWork2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle<Integer> rec1 = new Rectangle(12,13);
		Rectangle<Integer> rec2 = new Rectangle(13,13);
		System.out.println(rec1.isRectangle());
		System.out.println(rec2.isRectangle());
		
		Rectangle<Double> rec3 = new Rectangle(12.5, 12.5);
		System.out.println(rec3.isRectangle());
		
		Rectangle<String> rec4 = new Rectangle("14", "12");
		System.out.println(rec4.isRectangle());
	}

}
class Rectangle<T>{
	private T length;
	private T width;
	
	public Rectangle(T length, T width) {
		this.length = length;
		this.width = width;
	}
	public void setlength(T length) {
		this.length = length;
	}
	public T getLength() {
		return length;
	}
	
	public void setWidth(T width) {
		this.width = width;
	}
	
	public T getWidth() {
		return width;
	}
	
	public boolean isRectangle() {
		if(length instanceof String) {
			if(length.equals(width)) {
				return true;
			}
		}
		if(length instanceof Number) {
			if(length == width) return true;			
		}
		return false;
		
	}
	
	
}
//任务一：
//定义一个泛型类长方形Rectangle<T>,属性length和width,
//调用验证长和宽的类型一致都支持Integer,Double,String类型。
//使用getter和setter访问器赋值
//知识点：泛型
//


