package test018.java.exceptionhomework;

public class HomeWork2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(Season.SPRING);  
//		System.out.println(Season.SUMMER);
//		System.out.println(Season.AUTUMN);
//		System.out.println(Season.WINTER);

//		System.out.println("==����ö�ٵ�ֵ==");
//		for(Season season : Season.values()) {
//			System.out.println(season);
//		}

		Season season = Season.SUMMER;
		switch(season) {
		case SPRING:
			System.out.println("����");
			break;
		case SUMMER:
			System.out.println("����");
			break;
		case AUTUMN:
			System.out.println("����");
			break;
		case WINTER:
			System.out.println("����");
			break;
		}
		
	}

}
//�������
//����һ������ö���࣬ö�ٳ�Աֻ�д����ġ������
//ʵ�ֿ���̨���뼾�ڣ�
//���ϴ��죬��ʾ����ů��������
//�������죬��ʾ���������ס���
//�������죬��ʾ�������ˬ����
//���϶��죬��ʾ������ѩƮ����
