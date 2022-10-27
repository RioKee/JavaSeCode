package test019.java;

public class Exercise01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<Integer,Double> box1 = new Box<>(12, 12.5);				
		System.out.println(box1);
		System.out.println(1 << 2);
	}

}

class Box<T,E>{
	private T heigth;
	private E width;
	
	public Box(T height, E width) {
		this.heigth = height;
		this.width = width;
	}
	public String toString() {
		return "height=" + heigth + " width=" + width;
	}
	public T getHeigth() {
		return heigth;
	}
	public void setHeigth(T heigth) {
		this.heigth = heigth;
	}
	public E getWidth() {
		return width;
	}
	public void setWidth(E width) {
		this.width = width;
	}
	
}
	