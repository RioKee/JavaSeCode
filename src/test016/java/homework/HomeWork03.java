package test016.java.homework;

/**
 * ����������Ψ�����
 *
 * @author:kee
 */
public class HomeWork03 {
    public static void main(String[] args) {
        Input input = new Input();
        String user = "sdfasdfasdf";
        input.checkUserName(user);
    }
}
/**
 * ��֤����������û�������Ϊ�գ����ȴ���6�����������֡�
 * ��ʾ��ʹ���ַ���String�����ط������
 */
class Input{
    private String userName;

    public void checkUserName(String str){
        userName = str;
        if(str == null){
            System.out.println("�û�������Ϊ��");
            return;
        }
        int len = str.length();
        if(len < 6){
            System.out.println("����ĳ��ȱ������6");
            return;
        }
        for(int i = 0; i < len; i++){
            if(str.charAt(i) >= 48 && str.charAt(i) <= 58){
                System.out.println("�����в��������֣�����������");
                return;
            }
        }
        System.out.println("������ȷ");

    }
}