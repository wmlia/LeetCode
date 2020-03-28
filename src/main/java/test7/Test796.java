package test7;

public class Test796 {
    public static void main(String[] args) {
//        796. 旋转字符串
//        首先确认两个字符串的长度要相等。其次只要保证A+A 的字符串中包含B就可以了。因为A+A已经包含了所有可移动的方案。
        String A = "abcde";
        String B = "abced";

        boolean result = rotateString(A, B);
        System.out.println(result);
    }

    public static boolean rotateString(String A, String B) {
        boolean result=false;
        if (A.length()== B.length()&&(A + A).contains(B)){
            result=true;
        }
        return result;
    }
}
