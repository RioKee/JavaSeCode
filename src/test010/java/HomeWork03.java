package test010.java;

import java.util.Scanner;
public class HomeWork03 {
	public static void main(String[] args) {
		/*
		 * �û���  ����
		 * ����  123
		 * ����  456
		 * ����  789
		 */
		
		//��ʼ������
		User user1 = new User("admin", "123456");
		User user2 = new User("admin1", "7654321");
		User[] loginData = {user1, user2};
		
		System.out.println("========�û�ϵͳ=======");
		
		System.out.println("�˵�   1����½ ��2��ע�᣻ 3����ѯ  ��0���˳�");
		while(true) {
			System.out.print("��ѡ��˵���");
			String option = new Scanner(System.in).nextLine();
			
			switch(option) {
			case "1":
				loginSonMenu(loginData);
				break;
			case "2":
				loginData = registerSonMenu(loginData);
				break;
			case "3":
				System.out.print("������������룺");
				String search = new Scanner(System.in).nextLine();
				if("xitong".equals(search)) {
					info(loginData);
				}else {
					System.out.println("����ʧ��");
					break;
				}
			case "0":
				break;
				default:
					System.out.println("error:��������");
					continue;
			}
			break;
		}
	}
	
	//��½������֤�û��������Ϣ�Ƿ���ȷ
	/*
	 * @param ��½����
	 * @ return ture or false
	 * */
	public static boolean login(User[] user, String username, String password) {
		for(int i = 0; i < user.length; i++) {
			if(username.equals(user[i].getUsername()) && password.equals(user[i].getPassword())) {
				System.out.println("�û��� " + username + " ��¼�ɹ�");
				return true;
			}
		}
		return false;
	}


	/*
	* @param user
	* */
	public static boolean loginSonMenu(User[] user) {
		
		//���ε�½
		int n = 3;
		for(int i = n; i > 0; i--) {
			System.out.print("�˺�: ");
			String username_1 = new Scanner(System.in).nextLine();
			System.out.print("����: ");
			String password_1 = new Scanner(System.in).nextLine();

			boolean succes = login(user, username_1, password_1);
			if(succes) {
				return true;
			}else {
				System.out.println("�㻹��" + (i - 1) + "�λ��ᡣ������������");
			}
		}
		System.out.println(" ��¼ʧ��");
		return false;
		
	}
	
	/*
	 * ע�᷽��
	 * */
	public static User[] register(User[] user, String username, String password) {  //�Ľ�������Ӷ�����������к������������
		//�ж��û����Ƿ����
		for(int i = 0; i < user.length; i++) {
			if(username.equals(user[i].getUsername())) {
				System.out.println("�û����� " + username + " �Ѵ��ڣ�ע��ʧ��");
				return user;
			}
		}
		User[] userTemp = new User[user.length + 1];
		for(int i = 0; i < user.length; i++) {
			userTemp[i] = user[i];
		}
		userTemp[user.length] = new User();  //�����µĶ��󣬲������ڶ����������һλ
		userTemp[user.length].setUsername(username);  //д���˺�
		userTemp[user.length].setPassword(password);  //д������
		System.out.println(username + "ע��ɹ�������");
		return userTemp;
	}
	
	public static User[] registerSonMenu(User[] user) {
		System.out.print("�˺�: ");
		String username_1 = new Scanner(System.in).nextLine();
		System.out.print("����: ");
		String password_1 = new Scanner(System.in).nextLine();
		return register(user, username_1, password_1);
	}
	
	/*
	 * ��ѯ�û�
	 * */
	public static void  info(User[] user) {
		System.out.print("�û���\n");
		for(int i = 0; i < user.length; i++) {
			System.out.println(user[i].getUsername());
		}
	}
	
	
}
