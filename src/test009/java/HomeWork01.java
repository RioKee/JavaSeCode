package test009.java;

import java.util.Scanner;

public class HomeWork01{
    public static void main(String[] args) {

        //原始数据
        String[] words = {"apple", "banana", "cat", "dog"};
        System.out.println("1、查看所有数据；2、添加单词；3、修改指定单词；4、删除指定单词；5、退出；");


        Funcation f1 = new Funcation(words);
        Scanner input = new Scanner(System.in);

        while (true){


            System.out.print("请选择菜单:");
            int option = input.nextInt();
            switch (option) {
                case 1:
                    System.out.print("====请输入需要查询的单词选项 1:全部; 2:精确查询; 3:模糊查询====\n: ");
                    String search = input.next();

                    if (search.equals("1")) {//默认全部查询
                        f1.printWord();
                    } else if (search.equals("2")) { //精确查询
                        String word = inputInfo("请输入你要查询的单词:");
                        f1.printWord(word);
                    } else if (search.equals("3")) {  //模糊查询
                        String word = inputInfo("请输入你要查询的单词:");
                        f1.printWordLike(word);
                    }
                    continue;

                case 2:
                    System.out.print("2、添加单词 ");
                    String word2 = inputInfo("请输入你要添加的单词:");
                    f1.addWords(word2);
                    f1.printWord();
                    continue;

                case 3:
                    System.out.println("3、指定修改单词");
                    String word3_1 = inputInfo("请输入你要修改的的单词，输入格式为> [修改前] [修改后]:");
                    String word3_2 = new Scanner(System.in).nextLine();
                    f1.changeWords(word3_1, word3_2);

                    f1.printWord();
                    continue;
                case 4:
                    System.out.print("4、删除指定单词 > 1:选择下标方式; 2:选择指定单词\n:");
                    String search4 = input.next();
                    if(search4.equals("1")){
                        System.out.print("输入下标:");
                        int num = input.nextInt();
                        f1.delWords(num);
                        f1.printWord();
                    }else if(search4.equals("2")){
                        String word4 = inputInfo("请输入你要删除的单词:");
                        f1.delWords(word4);
                        f1.printWord();
                    }
                    continue;
                case 5:
                    System.out.println("退出程序");
                    break;
                default:
                    System.out.println("输入有误，请重新选择");
                    continue;
            }
            break;
        }

    }

    //自定义输出提示信息函数，同时加入输入操作
    public static String inputInfo(String str){
        System.out.print(str);  //输出提示信息
        String scanner = new Scanner(System.in).nextLine();  //创建接受操作对象
        return scanner;
    }


}
