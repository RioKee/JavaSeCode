package test015;

public class homeWork2_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flute flute = new Flute();
		Guitar guitar = new Guitar();
		Piano piano = new Piano();
		
		EmployeeA empl1 = new EmployeeA("С��");
		EmployeeA empl2 = new EmployeeA("С��");
		EmployeeA empl3 = new EmployeeA("С��");
		
		Concert concert = new Concert();
		concert.concert(empl1, flute);
		concert.concert(empl2, guitar);
		concert.concert(empl3, piano);
	}

}
/**
 ��˾�ٰ����ִ�����  Musical   Guitar  Piano  Flute
 Ա������ѡ��ͬ�������������࣬
 ģ��������̡�
 */
class Concert{
	public void concert(EmployeeA empl, Musical musical) {
		System.out.print(empl.getName());
		musical.play();
	}
}
class EmployeeA{
	private String name;
	public EmployeeA(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
class Flute extends Musical{
	@Override
	public void play() {
		System.out.println(" �������������");
	}
}
class Piano extends Musical{
	@Override
	public void play() {
		System.out.println(" �������������");
	}
}
class Guitar extends Musical{
	@Override
	public void play() {
		System.out.println(" �������༪����");
	}
}
abstract class Musical{
	abstract void play();
}