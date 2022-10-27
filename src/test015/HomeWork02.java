package test015;

public class HomeWork02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle = new Circle(5);
		System.out.println("圆的面积为： " + circle.area());
		Triangle triangle = new Triangle(4, 5);
		System.out.println("三角形的面积为： " + triangle.area());

	}

}
/**
 * 定义一个接口Shape，该接口有一个计算面积的方法area()，该方法返回一个double类型的返回值。
定义一个三角形类(Triangle)，该类实现了Shape接口。
该类有两个属性height(三角形的高)，和length(三角形的底边长)，该类实现了area()方法，以计算三角形的面积。
定义一个圆形类(Circle)，该类实现了Shape接口。该类有一个属性radius(圆的半径)，该类实现了area()方法，以计算圆形的面积。
定义Main类，在其main方法中，创建一个三角形类和一个圆形类，分别调用它们的area()方法以计算其面积

*/
class Circle implements Shape{
	public final double PI = 3.14;
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	@Override
	public double area() {
		return PI * radius * radius;
	}
}
class Triangle implements Shape{
	private double height;
	private double length;
	public Triangle(double height, double length) {
		this.height = height;
		this.length = length;
	}
	
	@Override 
	public double area() {
		return height * length;
	}
}
interface Shape{
	double area();
}