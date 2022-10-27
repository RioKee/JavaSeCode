package test014.java;

public class Exercise02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee1 = new Employee("郭靖", "男", 18, 1001, "北京");
		Employee employee2 = new Employee("郭靖", "男", 18, 1001, "北京");
		Employee employee3 = new Employee("黄蓉", "女", 18, 1002, "上海");
		
		System.out.println("员工1：" + employee1.getName() + "  和员工2 ："+ employee1.getName() +
				"    是否为同一个员工：" + employee1.equals(employee2));
		System.out.println(employee1);
		System.out.println(employee2);
		System.out.println(employee3);

	}

}



