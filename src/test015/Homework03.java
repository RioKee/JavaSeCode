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
 * 实现思路及关键代码
1)	定义PCI接口，具有传送数据send()方法
2)	定义显卡VideaCard类，实现该接口
3)	定义声卡AudioCard类，实现PCI接口
4)	定义网卡NetCard类，实现PCI接口
5)	定义测试类，让显卡、声卡、网卡发送数据
 */
class NetCard extends Data implements PCI{
	public NetCard(double data) {
		super(data);
	}
	@Override
	public double send() {
		System.out.println("网卡发送数据" + getData() + "kb");
		return getData();
	}
}



class AudioCard extends Data implements PCI{
	public AudioCard(double data) {
		super(data);
	}
	@Override
	public double send() {
		System.out.println("声卡发送数据"+ getData() + "kb");
		return getData();
	}
}

class VideaCard extends Data implements PCI{
	public VideaCard(double data) {
		super(data);
	}
	@Override
	public double send() {
		System.out.println("显卡发送数据"+ getData() + "kb");
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
