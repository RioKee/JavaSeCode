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
���̬
       ����һ������ ͼ����Shape���з��� ��ͼdraw()���Ͳ���erase()��
       ʹ�ö�̬ʵ�֣�Բ�� ʵ��  ��Բ�κͲ���Բ�Σ�
                              �����Σ��������κͲ��������Ρ�
 */
class Square extends ShapeBase{
	@Override
	public void draw() {
		System.out.println("����һ��������");
	}
	@Override
	public void erase() {
		System.out.println("������һ��������");
	}
}

class CircleA extends ShapeBase{
	@Override 
	public void draw() {
		System.out.println("����һ��Բ");
	}
	@Override
	public void erase() {
		System.out.println("������һ��Բ");
	}
}

abstract class ShapeBase{
	abstract void draw();
	abstract void erase();
}