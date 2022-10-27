package test014.java.homework;

public class HomeWork02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CodeJob codeJob1 = new CodeJob("开发小张", 10000, 500);
		TestJob testJob1 = new TestJob("测试小李", 5000, 400);
		
		codeJob1.showJob();
		System.out.println("============");
		testJob1.showJob();
		Object obj;
//		System.out.println(obj);
	}

}
