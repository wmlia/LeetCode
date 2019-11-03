public class Test191 {
    public static void main(String[] args) {
//        191. 位1的个数
//        编写一个函数，输入是一个无符号整数，返回其二进制表达式中数字位数为 ‘1’ 的个数（也被称为汉明重量）。
        int n=294967293;
        int num = hammingWeight(n);
        System.out.println(num);

    }

    public static int hammingWeight(int n) {
        int num=0;
//        先将数字转为二进制，再转为char数组
        char[] chs=Integer.toBinaryString(n).toCharArray();
//        遍历char数组看有多少个1
        for (int i = 0; i <chs.length; i++) {
            if(chs[i]=='1'){
                num++;
            }
        }
        return num;
    }
}
