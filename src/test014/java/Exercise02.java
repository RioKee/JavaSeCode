package test014.java;

public class Exercise02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee1 = new Employee("����", "��", 18, 1001, "����");
		Employee employee2 = new Employee("����", "��", 18, 1001, "����");
		Employee employee3 = new Employee("����", "Ů", 18, 1002, "�Ϻ�");
		
		System.out.println("Ա��1��" + employee1.getName() + "  ��Ա��2 ��"+ employee1.getName() +
				"    �Ƿ�Ϊͬһ��Ա����" + employee1.equals(employee2));
		System.out.println(employee1);
		System.out.println(employee2);
		System.out.println(employee3);

	}

}



