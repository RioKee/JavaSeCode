package test015;

public class homeWork2_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flute flute = new Flute();
		Guitar guitar = new Guitar();
		Piano piano = new Piano();
		
		EmployeeA empl1 = new EmployeeA("小李");
		EmployeeA empl2 = new EmployeeA("小明");
		EmployeeA empl3 = new EmployeeA("小刘");
		
		Concert concert = new Concert();
		concert.concert(empl1, flute);
		concert.concert(empl2, guitar);
		concert.concert(empl3, piano);
	}

}
/**
 公司举办器乐大赛，  Musical   Guitar  Piano  Flute
 员工可以选择不同的乐器进行演奏，
 模拟演奏过程。
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
		System.out.println(" 正在演奏笛子中");
	}
}
class Piano extends Musical{
	@Override
	public void play() {
		System.out.println(" 正在演奏钢琴中");
	}
}
class Guitar extends Musical{
	@Override
	public void play() {
		System.out.println(" 正在演奏吉他中");
	}
}
abstract class Musical{
	abstract void play();
}