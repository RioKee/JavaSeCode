package test012.java;

public class HomeWork05_SingleMode {

}

/**
 * 设计模式——单列模式
 * 
 * 单列模式写法：懒汉式、饿汉式、登记式 单列模式特点： 
 * 1）单列模式只能有一个实例
 * 2）单列类必须自己创建自己唯一的示例
 * 3）单列类必须给其他对象提供其他这一实例
 *
 */

//懒汉式单例类.在第一次调用的时候实例化自己 
class Singleton {
	private Singleton() {
	}

	private static Singleton single = null;

	// 静态工厂方法
	public static Singleton getInstance() {
		if (single == null) {
			single = new Singleton();
		}
		return single;
	}
}


