package test011.java;



public class Exercise002 {

    private String name = "�����ⲿ�������name";

    public Exercise002() {
        System.out.println("3�������޲ι�����");
    }

    {
        System.out.println("2�����Ǵ����");
    }

    static {
        System.out.println("1�����Ǿ�̬�����");
    }

    class InnerClass {
        private String name = "���Ǿ�̬�ڲ��������Inner_name";

        public InnerClass() {
            System.out.println("5������InnerClass�޲ι�����");
        }

        {
            System.out.println("4������InnerClass�����");
        }

        public void f1() {
            System.out.println(Exercise002.this.name);

        }

    }


    public static void main(String[] args) {
        Exercise002 e002 = new Exercise002();
        Exercise002.InnerClass e = e002.new InnerClass();  //�����ڲ����Ա
        Cat cat = new Cat(); //Cat�̳���abstract Test�࣬������д������Test()�е�method()����
        cat.method1();
        cat.method2();
        cat.method3();
    }
}

abstract class Test {
    //1�����󷽷������з�����
    //2�����󷽷�ֻ���� public protected Ĭ������
    public  abstract void method1();
    protected  abstract void method2();
    abstract void method3();
//    private void method4();


    void f1(){  //��ͨ����
        System.out.println("����Test������ method()�����ķ�����,�ұ�����ڣ����ұ��̳�ʱ���ұ��뱻������д");
    }
}

interface IA {
    public static final int num = 0;    //Ĭ�ϱ�public static final ����  �������ʼֵ
    String name = null;  //Ĭ�ϱ�final�������Ա������ʼֵ
//	void eat() {}; //���󣬽ӿڵķ��������з�����
    void say();
    void run();
}

class Tiger implements IA {  //ʵ�ֽӿڣ��ͱ���ѽӿ��еķ�����д
    public void say() {
        System.out.println("Tigerʵ����IA�ӿڵ�say()����");
    }
    public void run() {
        System.out.println("Tigerʵ����IA�ӿڵ�say()����");
    }
}

class Cat extends Test{
    @Override
    public void method1() {
        System.out.println("���ǳ��󷽷���д���method1()");
    }

    @Override
    protected void method2() {
        System.out.println("���ǳ��󷽷���д���method2()");
    }

    @Override
    void method3() {
        System.out.println("���ǳ��󷽷���д���method3()");
    }
}