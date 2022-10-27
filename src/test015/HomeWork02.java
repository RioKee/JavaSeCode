package test015;

public class HomeWork02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle = new Circle(5);
		System.out.println("Բ�����Ϊ�� " + circle.area());
		Triangle triangle = new Triangle(4, 5);
		System.out.println("�����ε����Ϊ�� " + triangle.area());

	}

}
/**
 * ����һ���ӿ�Shape���ýӿ���һ����������ķ���area()���÷�������һ��double���͵ķ���ֵ��
����һ����������(Triangle)������ʵ����Shape�ӿڡ�
��������������height(�����εĸ�)����length(�����εĵױ߳�)������ʵ����area()�������Լ��������ε������
����һ��Բ����(Circle)������ʵ����Shape�ӿڡ�������һ������radius(Բ�İ뾶)������ʵ����area()�������Լ���Բ�ε������
����Main�࣬����main�����У�����һ�����������һ��Բ���࣬�ֱ�������ǵ�area()�����Լ��������

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