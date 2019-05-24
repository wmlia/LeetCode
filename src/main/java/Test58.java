public class Test58 {
    public static void main(String[] args) {
        //    58. 最后一个单词的长度
//        输入: "Hello World  "
//        输出: 5\

        String s="  ";
        int a=lengthOfLastWord(s);
        System.out.println(a);

    }

    public static int lengthOfLastWord(String s) {
//        用空格分隔
        String[] result=s.split(" ");
        int x;

//        如果字符串只包含空格
        if(result.length==0){
            x=0;
        }else{
//            非空格字符串
            x=result[result.length-1].length();
        }
        return x;
    }


}
