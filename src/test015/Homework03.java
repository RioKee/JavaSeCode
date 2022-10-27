package test015;

public class Homework03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VideaCard videaCard = new VideaCard(100);
		videaCard.send();
		AudioCard audioCard = new AudioCard(50);
		audioCard.send();
		NetCard netCard = new NetCard(500);		
		netCard.send();
	}

}
/**
 * ʵ��˼·���ؼ�����
1)	����PCI�ӿڣ����д�������send()����
2)	�����Կ�VideaCard�࣬ʵ�ָýӿ�
3)	��������AudioCard�࣬ʵ��PCI�ӿ�
4)	��������NetCard�࣬ʵ��PCI�ӿ�
5)	��������࣬���Կ���������������������
 */
class NetCard extends Data implements PCI{
	public NetCard(double data) {
		super(data);
	}
	@Override
	public double send() {
		System.out.println("������������" + getData() + "kb");
		return getData();
	}
}



class AudioCard extends Data implements PCI{
	public AudioCard(double data) {
		super(data);
	}
	@Override
	public double send() {
		System.out.println("������������"+ getData() + "kb");
		return getData();
	}
}

class VideaCard extends Data implements PCI{
	public VideaCard(double data) {
		super(data);
	}
	@Override
	public double send() {
		System.out.println("�Կ���������"+ getData() + "kb");
		return getData();
	}
}
abstract class Data{
	private double data;
	public Data(double data) {
		super();
		this.data = data;
	}
	public double getData() {
		return data;
	}
	public void setData(double data) {
		this.data = data;
	}
}
interface PCI{
	double send();
}
