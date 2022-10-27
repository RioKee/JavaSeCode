package test009.java;

public class Funcation {
    /* 作业1：数据的处理：添加，删除，修改，查询   用函数方法完成对应功能
     * 		System.out.println("1、查看所有数据；2、添加单词；3、修改指定单词；4、删除指定单词；5、退出；");
     * 			1、//查询所有//精确查询：输入一个单词，在数组中找到这个单词，及位置
     *              //选做：模糊查询，输入不完整的单词，包含输入的单词的元素查询出来
     * 			2、//添加单词 //输入一个单词添加到数组中 // 把添加过的数组所有元素输出searchAll(words);
     * 			3、// 通过位置修改，通过输入单词找到对应的单词修改 //数组所有元素输出searchAll(words);
     * 			4、 // 通过位置删除单词，通过输入单词删除 //数组所有元素输出searchAll(words);
     *
     **/
    public String[] words;  //定义一个数组属性

    public Funcation(String[] words){  //初始化数组
        this.words = words;
    }

    //1.1、默认输出全部
    public void printWord(){
        //1、查询所有  默认输出全部数组元素,利用重载的概念
        System.out.print("结果为:");
        for(int i = 0; i < this.words.length; i++){
            System.out.print(this.words[i] + " ");
        }
        System.out.println();
    }
    //1.2、传递一个单词判断是否在里面，输出单词，和索引值
    //精确查询：输入一个单词，在数组中找到这个单词，及位置
    // 形参： 传递一个数组元素，传递一个单词
    public void printWord(String str){
        if(inWords(str)){
            for(int i = 0; i < words.length; i++) {
                if(str.equals(words[i])){
                    System.out.print(words[i] + " 下标为：" + i);
                }
            }
            System.out.println();
        }else{
            System.out.println("输入元素不存在");
        }
    }

    //1.3模糊查询
    public void printWordLike(String str){
        for(int i = 0; i < words.length; i++) {  //遍历出一维数组的元素，  apple  a
            if(words[i].contains(str)){
                System.out.print(words[i] + " ");
            }
        }
    }

    //判断一个元素是否存在数组中，然后就boolean类型的值
    private boolean inWords(String str){
        for(int i = 0; i < words.length; i++) {
            if(str.equals(words[i])){
                return true;
            }
        }
        return false;
    }

   // 2、添加单词 输入一个单词添加到数组中 // 把添加过的数组所有元素输出searchAll(words);
    public String[] addWords(String str){
        System.out.println();
        String[] strings = new String[words.length + 1];
        for(int i = 0; i < words.length; i++) {
            strings[i] = words[i];
        }
        strings[strings.length - 1] = str;
        return this.words = strings;
    }

    // 3、通过单词修改，通过输入单词找到对应的单词修改 //数组所有元素输出searchAll(words);
    public String[] changeWords(String str1, String str2){
        if(inWords(str1)){ //判断是否存在
            for (int i = 0; i < words.length; i++) {
                if(str1.equals(words[i])){  //判断数组中是否有相同的值，有就重新赋值
                    words[i] = str2;
                }
            }
        }else{
            System.out.println("你输入的元素不存在");
            return this.words;
        }
        return words;
    }

    //4、 通过位置删除单词，通过输入单词删除 //数组所有元素输出searchAll(words);
    //返回值：返回一个删减后的数组
    public String[] delWords(int num){
        if(num >= 0 && num <= words.length-1){  //下标要小于等于数组长度，还要大于0
            String[] strings = new String[words.length - 1];
            for (int i = 0, j = 0; i < words.length; i++){
                if(num != i){
                    strings[j] = words[i];
                    j++;
                }
            }
            System.out.println(words[num] + "已删除");
            return this.words = strings;
        }else{
            System.out.println("error");
        }
        return this.words;
    }

    //删除指定的单词，默认全部都删除
    //默认删除第一个  默认删除最后一个
    public String[] delWords(String str){
        String[] wordsTemp = new String[words.length];  //拷贝一份新的数组
        if(inWords(str)){  //判断元素删除的元素是否存在，存在就复制，否则提前退出
            for (int i = 0; i < wordsTemp.length; i++) {
                wordsTemp[i] = words[i];
            }
        }else{
            System.out.println("error:你输入的元素不存在");
            return words;
        }
        int num = 0;  //记录有有多少重复的值
        for (int i = 0; i < wordsTemp.length; i++) {
            if (str.equals(wordsTemp[i])){
                wordsTemp[i] = null;
                num++;
            }
        }
        //进行元素删除操作
        String temp[] = new String[wordsTemp.length - num];  //初始化删除后数组长度
        for (int i = 0, j = 0; i < wordsTemp.length; i++) {
            if(wordsTemp[i] != null){
                temp[j] = wordsTemp[i];
                j++;
            }
        }
        System.out.println(words[num] + "已删除");
        return this.words = temp;
    }
}
