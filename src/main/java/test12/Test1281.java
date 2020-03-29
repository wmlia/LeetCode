package test12;

public class Test1281 {
    public static void main(String[] args) {
//        1281. 整数的各位积和之差
//        给你一个整数 n，请你帮忙计算并返回该整数「各位数字之积」与「各位数字之和」的差。
//        输入：n = 234
//        输出：15
//        解释：
//        各位数之积 = 2 * 3 * 4 = 24
//        各位数之和 = 2 + 3 + 4 = 9
//        结果 = 24 - 9 = 15
        int n=234;
        int result = subtractProductAndSum(n);

        System.out.println(result);
    }

    public static int subtractProductAndSum(int n) {
        //        定义积、和、结果
        int x=0;
        int y=1;
        int result=0;

        while (n!=0){
            x+=n%10;
            y*=n%10;
            n=n/10;
        }

        result=y-x;
        return result;
    }
}
