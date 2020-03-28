package test6;

public class Test693 {
    public static void main(String[] args) {
//        693. 交替位二进制数
//        给定一个正整数，检查他是否为交替位二进制数：换句话说，就是他的二进制数相邻的两个位数永不相等。
        int n=7;
        boolean result = hasAlternatingBits(n);

        System.out.println(result);

    }

    public static boolean hasAlternatingBits(int n) {
        boolean result=true;
//        先将数字转为二进制，再转为char数组
        char[] chs=Integer.toBinaryString(n).toCharArray();
//        遍历char数组看有多少个1
        for (int i = 0; i <chs.length-1; i++) {
            if(chs[i]==chs[i+1]){
                result=false;
                break;
            }
        }
        return result;
    }
}
