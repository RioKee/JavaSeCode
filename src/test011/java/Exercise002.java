package test011.java;



public class Exercise002 {

    private String name = "我是外部类的属性name";

    public Exercise002() {
        System.out.println("3、我是无参构造器");
    }

    {
        System.out.println("2、我是代码块");
    }

    static {
        System.out.println("1、我是静态代码块");
    }

    class InnerClass {
        private String name = "我是静态内部类的属性Inner_name";

        public InnerClass() {
            System.out.println("5、我是InnerClass无参构造器");
        }

        {
            System.out.println("4、我是InnerClass代码块");
        }

        public void f1() {
            System.out.println(Exercise002.this.name);

        }

    }


    public static void main(String[] args) {
        Exercise002 e002 = new Exercise002();
        Exercise002.InnerClass e = e002.new InnerClass();  //访问内部类成员
        Cat cat = new Cat(); //Cat继承了abstract Test类，必须重写抽象类Test()中的method()方法
        cat.method1();
        cat.method2();
        cat.method3();
    }
}

abstract class Test {
    //1、抽象方法不能有方法体
    //2、抽象方法只能由 public protected 默认修饰
    public  abstract void method1();
    protected  abstract void method2();
    abstract void method3();
//    private void method4();


    void f1(){  //普通方法
        System.out.println("我是Test抽象类 method()方法的方法体,我必须存在，当我被继承时，我必须被子类重写");
    }
}

interface IA {
    public static final int num = 0;    //默认被public static final 修饰  必须给初始值
    String name = null;  //默认被final修饰所以必须给初始值
//	void eat() {}; //错误，接口的方法不能有方法体
    void say();
    void run();
}

class Tiger implements IA {  //实现接口，就必须把接口中的方法重写
    public void say() {
        System.out.println("Tiger实现了IA接口的say()方法");
    }
    public void run() {
        System.out.println("Tiger实现了IA接口的say()方法");
    }
}

class Cat extends Test{
    @Override
    public void method1() {
        System.out.println("我是抽象方法重写后的method1()");
    }

    @Override
    protected void method2() {
        System.out.println("我是抽象方法重写后的method2()");
    }

    @Override
    void method3() {
        System.out.println("我是抽象方法重写后的method3()");
    }
}