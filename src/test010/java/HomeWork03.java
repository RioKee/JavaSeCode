package test010.java;

import java.util.Scanner;
public class HomeWork03 {
	public static void main(String[] args) {
		/*
		 * 用户名  密码
		 * 张三  123
		 * 李四  456
		 * 王五  789
		 */
		
		//初始化数据
		User user1 = new User("admin", "123456");
		User user2 = new User("admin1", "7654321");
		User[] loginData = {user1, user2};
		
		System.out.println("========用户系统=======");
		
		System.out.println("菜单   1：登陆 ；2：注册； 3；查询  ；0：退出");
		while(true) {
			System.out.print("请选择菜单：");
			String option = new Scanner(System.in).nextLine();
			
			switch(option) {
			case "1":
				loginSonMenu(loginData);
				break;
			case "2":
				loginData = registerSonMenu(loginData);
				break;
			case "3":
				System.out.print("请输入访问密码：");
				String search = new Scanner(System.in).nextLine();
				if("xitong".equals(search)) {
					info(loginData);
				}else {
					System.out.println("访问失败");
					break;
				}
			case "0":
				break;
				default:
					System.out.println("error:输入有误");
					continue;
			}
			break;
		}
	}
	
	//登陆，就验证用户输入的信息是否正确
	/*
	 * @param 登陆方法
	 * @ return ture or false
	 * */
	public static boolean login(User[] user, String username, String password) {
		for(int i = 0; i < user.length; i++) {
			if(username.equals(user[i].getUsername()) && password.equals(user[i].getPassword())) {
				System.out.println("用户： " + username + " 登录成功");
				return true;
			}
		}
		return false;
	}


	/*
	* @param user
	* */
	public static boolean loginSonMenu(User[] user) {
		
		//三次登陆
		int n = 3;
		for(int i = n; i > 0; i--) {
			System.out.print("账号: ");
			String username_1 = new Scanner(System.in).nextLine();
			System.out.print("密码: ");
			String password_1 = new Scanner(System.in).nextLine();

			boolean succes = login(user, username_1, password_1);
			if(succes) {
				return true;
			}else {
				System.out.println("你还有" + (i - 1) + "次机会。。请重新输入");
			}
		}
		System.out.println(" 登录失败");
		return false;
		
	}
	
	/*
	 * 注册方法
	 * */
	public static User[] register(User[] user, String username, String password) {  //改进，课添加对象进来，进行后续的数据添加
		//判断用户名是否存在
		for(int i = 0; i < user.length; i++) {
			if(username.equals(user[i].getUsername())) {
				System.out.println("用户名： " + username + " 已存在，注册失败");
				return user;
			}
		}
		User[] userTemp = new User[user.length + 1];
		for(int i = 0; i < user.length; i++) {
			userTemp[i] = user[i];
		}
		userTemp[user.length] = new User();  //创建新的对象，并存在在对象数组最后一位
		userTemp[user.length].setUsername(username);  //写入账号
		userTemp[user.length].setPassword(password);  //写入密码
		System.out.println(username + "注册成功。。。");
		return userTemp;
	}
	
	public static User[] registerSonMenu(User[] user) {
		System.out.print("账号: ");
		String username_1 = new Scanner(System.in).nextLine();
		System.out.print("密码: ");
		String password_1 = new Scanner(System.in).nextLine();
		return register(user, username_1, password_1);
	}
	
	/*
	 * 查询用户
	 * */
	public static void  info(User[] user) {
		System.out.print("用户名\n");
		for(int i = 0; i < user.length; i++) {
			System.out.println(user[i].getUsername());
		}
	}
	
	
}
