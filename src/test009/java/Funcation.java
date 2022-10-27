package test009.java;

public class Funcation {
    /* ��ҵ1�����ݵĴ�����ӣ�ɾ�����޸ģ���ѯ   �ú���������ɶ�Ӧ����
     * 		System.out.println("1���鿴�������ݣ�2����ӵ��ʣ�3���޸�ָ�����ʣ�4��ɾ��ָ�����ʣ�5���˳���");
     * 			1��//��ѯ����//��ȷ��ѯ������һ�����ʣ����������ҵ�������ʣ���λ��
     *              //ѡ����ģ����ѯ�����벻�����ĵ��ʣ���������ĵ��ʵ�Ԫ�ز�ѯ����
     * 			2��//��ӵ��� //����һ��������ӵ������� // ����ӹ�����������Ԫ�����searchAll(words);
     * 			3��// ͨ��λ���޸ģ�ͨ�����뵥���ҵ���Ӧ�ĵ����޸� //��������Ԫ�����searchAll(words);
     * 			4�� // ͨ��λ��ɾ�����ʣ�ͨ�����뵥��ɾ�� //��������Ԫ�����searchAll(words);
     *
     **/
    public String[] words;  //����һ����������

    public Funcation(String[] words){  //��ʼ������
        this.words = words;
    }

    //1.1��Ĭ�����ȫ��
    public void printWord(){
        //1����ѯ����  Ĭ�����ȫ������Ԫ��,�������صĸ���
        System.out.print("���Ϊ:");
        for(int i = 0; i < this.words.length; i++){
            System.out.print(this.words[i] + " ");
        }
        System.out.println();
    }
    //1.2������һ�������ж��Ƿ������棬������ʣ�������ֵ
    //��ȷ��ѯ������һ�����ʣ����������ҵ�������ʣ���λ��
    // �βΣ� ����һ������Ԫ�أ�����һ������
    public void printWord(String str){
        if(inWords(str)){
            for(int i = 0; i < words.length; i++) {
                if(str.equals(words[i])){
                    System.out.print(words[i] + " �±�Ϊ��" + i);
                }
            }
            System.out.println();
        }else{
            System.out.println("����Ԫ�ز�����");
        }
    }

    //1.3ģ����ѯ
    public void printWordLike(String str){
        for(int i = 0; i < words.length; i++) {  //������һά�����Ԫ�أ�  apple  a
            if(words[i].contains(str)){
                System.out.print(words[i] + " ");
            }
        }
    }

    //�ж�һ��Ԫ���Ƿ���������У�Ȼ���boolean���͵�ֵ
    private boolean inWords(String str){
        for(int i = 0; i < words.length; i++) {
            if(str.equals(words[i])){
                return true;
            }
        }
        return false;
    }

   // 2����ӵ��� ����һ��������ӵ������� // ����ӹ�����������Ԫ�����searchAll(words);
    public String[] addWords(String str){
        System.out.println();
        String[] strings = new String[words.length + 1];
        for(int i = 0; i < words.length; i++) {
            strings[i] = words[i];
        }
        strings[strings.length - 1] = str;
        return this.words = strings;
    }

    // 3��ͨ�������޸ģ�ͨ�����뵥���ҵ���Ӧ�ĵ����޸� //��������Ԫ�����searchAll(words);
    public String[] changeWords(String str1, String str2){
        if(inWords(str1)){ //�ж��Ƿ����
            for (int i = 0; i < words.length; i++) {
                if(str1.equals(words[i])){  //�ж��������Ƿ�����ͬ��ֵ���о����¸�ֵ
                    words[i] = str2;
                }
            }
        }else{
            System.out.println("�������Ԫ�ز�����");
            return this.words;
        }
        return words;
    }

    //4�� ͨ��λ��ɾ�����ʣ�ͨ�����뵥��ɾ�� //��������Ԫ�����searchAll(words);
    //����ֵ������һ��ɾ���������
    public String[] delWords(int num){
        if(num >= 0 && num <= words.length-1){  //�±�ҪС�ڵ������鳤�ȣ���Ҫ����0
            String[] strings = new String[words.length - 1];
            for (int i = 0, j = 0; i < words.length; i++){
                if(num != i){
                    strings[j] = words[i];
                    j++;
                }
            }
            System.out.println(words[num] + "��ɾ��");
            return this.words = strings;
        }else{
            System.out.println("error");
        }
        return this.words;
    }

    //ɾ��ָ���ĵ��ʣ�Ĭ��ȫ����ɾ��
    //Ĭ��ɾ����һ��  Ĭ��ɾ�����һ��
    public String[] delWords(String str){
        String[] wordsTemp = new String[words.length];  //����һ���µ�����
        if(inWords(str)){  //�ж�Ԫ��ɾ����Ԫ���Ƿ���ڣ����ھ͸��ƣ�������ǰ�˳�
            for (int i = 0; i < wordsTemp.length; i++) {
                wordsTemp[i] = words[i];
            }
        }else{
            System.out.println("error:�������Ԫ�ز�����");
            return words;
        }
        int num = 0;  //��¼���ж����ظ���ֵ
        for (int i = 0; i < wordsTemp.length; i++) {
            if (str.equals(wordsTemp[i])){
                wordsTemp[i] = null;
                num++;
            }
        }
        //����Ԫ��ɾ������
        String temp[] = new String[wordsTemp.length - num];  //��ʼ��ɾ�������鳤��
        for (int i = 0, j = 0; i < wordsTemp.length; i++) {
            if(wordsTemp[i] != null){
                temp[j] = wordsTemp[i];
                j++;
            }
        }
        System.out.println(words[num] + "��ɾ��");
        return this.words = temp;
    }
}
