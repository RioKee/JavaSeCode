package test015;

public class HomeWork2_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		func(new CircleA());
		func(new Square());
	}
	public static void func(ShapeBase shapeBase) {
		shapeBase.draw();
		shapeBase.erase();
	}

}
/**
类多态
       定义一个超类 图形类Shape，有方法 画图draw()，和擦除erase()。
       使用多态实现：圆形 实现  画圆形和擦除圆形；
                              正方形，画正方形和擦除正方形。
 */
class Square extends ShapeBase{
	@Override
	public void draw() {
		System.out.println("画了一个正方形");
	}
	@Override
	public void erase() {
		System.out.println("擦除了一个正方形");
	}
}

class CircleA extends ShapeBase{
	@Override 
	public void draw() {
		System.out.println("画了一个圆");
	}
	@Override
	public void erase() {
		System.out.println("擦出了一个圆");
	}
}

abstract class ShapeBase{
	abstract void draw();
	abstract void erase();
}