package test015;

public class HomeWork2_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		view(new Person());
		view(new Fish());
		view(new Submarine());
	}
	public static void view(Swimm swimm) {
		swimm.swimming();
	}

}
/**
 * 任务一： 接口多态
定义一个游泳接口。
使用多态实现：鱼可以游泳；
                      人可以游泳；
                      潜水艇可以游泳；
 */
interface Swimm{
	void swimming();
}
class Submarine implements Swimm{
	@Override
	public void swimming() {
		System.out.println("潜水艇正在游泳");
	}
}
class Fish implements Swimm{
	@Override
	public void swimming() {
		System.out.println("鱼儿正在游泳");
	}
}
class Person implements Swimm{
	@Override 
	public void swimming() {
		System.out.println("人正在游泳");
	}
}