package test5;

public class Test557 {
    public static void main(String[] args) {
//        557. 反转字符串中的单词 III
//        输入: "Let's take LeetCode contest"
//        输出: "s'teL ekat edoCteeL tsetnoc"
//        源字符串
        String s="Let's take LeetCode contest";
        String result = reverseWords(s);

        System.out.println(s);
//        看出没有末尾的空格
        System.out.println(result+"++");

    }

    public static String reverseWords(String s) {
        //        结果字符串
        StringBuffer result=new StringBuffer();

//        源字符串中临时变量单词
        StringBuffer temp=null;
//        提取s 的每个单词
        String[] s1 = s.split(" ");
//        遍历数组翻转每个单词
        for (int i = 0; i <s1.length; i++) {
//            单词翻转
            temp=new StringBuffer(s1[i]);
            temp.reverse();

            if(i==s1.length-1){
                result.append(temp);
            }else{
                result.append(temp).append(" ");
            }
        }
        return result.toString();
    }
}
