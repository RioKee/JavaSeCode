package test009.java;

import java.util.Scanner;

public class HomeWork01{
    public static void main(String[] args) {

        //ԭʼ����
        String[] words = {"apple", "banana", "cat", "dog"};
        System.out.println("1���鿴�������ݣ�2����ӵ��ʣ�3���޸�ָ�����ʣ�4��ɾ��ָ�����ʣ�5���˳���");


        Funcation f1 = new Funcation(words);
        Scanner input = new Scanner(System.in);

        while (true){


            System.out.print("��ѡ��˵�:");
            int option = input.nextInt();
            switch (option) {
                case 1:
                    System.out.print("====��������Ҫ��ѯ�ĵ���ѡ�� 1:ȫ��; 2:��ȷ��ѯ; 3:ģ����ѯ====\n: ");
                    String search = input.next();

                    if (search.equals("1")) {//Ĭ��ȫ����ѯ
                        f1.printWord();
                    } else if (search.equals("2")) { //��ȷ��ѯ
                        String word = inputInfo("��������Ҫ��ѯ�ĵ���:");
                        f1.printWord(word);
                    } else if (search.equals("3")) {  //ģ����ѯ
                        String word = inputInfo("��������Ҫ��ѯ�ĵ���:");
                        f1.printWordLike(word);
                    }
                    continue;

                case 2:
                    System.out.print("2����ӵ��� ");
                    String word2 = inputInfo("��������Ҫ��ӵĵ���:");
                    f1.addWords(word2);
                    f1.printWord();
                    continue;

                case 3:
                    System.out.println("3��ָ���޸ĵ���");
                    String word3_1 = inputInfo("��������Ҫ�޸ĵĵĵ��ʣ������ʽΪ> [�޸�ǰ] [�޸ĺ�]:");
                    String word3_2 = new Scanner(System.in).nextLine();
                    f1.changeWords(word3_1, word3_2);

                    f1.printWord();
                    continue;
                case 4:
                    System.out.print("4��ɾ��ָ������ > 1:ѡ���±귽ʽ; 2:ѡ��ָ������\n:");
                    String search4 = input.next();
                    if(search4.equals("1")){
                        System.out.print("�����±�:");
                        int num = input.nextInt();
                        f1.delWords(num);
                        f1.printWord();
                    }else if(search4.equals("2")){
                        String word4 = inputInfo("��������Ҫɾ���ĵ���:");
                        f1.delWords(word4);
                        f1.printWord();
                    }
                    continue;
                case 5:
                    System.out.println("�˳�����");
                    break;
                default:
                    System.out.println("��������������ѡ��");
                    continue;
            }
            break;
        }

    }

    //�Զ��������ʾ��Ϣ������ͬʱ�����������
    public static String inputInfo(String str){
        System.out.print(str);  //�����ʾ��Ϣ
        String scanner = new Scanner(System.in).nextLine();  //�������ܲ�������
        return scanner;
    }


}
