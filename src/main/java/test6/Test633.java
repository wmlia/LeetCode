package test6;

public class Test633 {
    public static void main(String[] args) {
//        633. 平方数之和
//        给定一个非负整数 c ，你要判断是否存在两个整数 a 和 b，使得 a2 + b2 = c。
//        输入: 5
//        输出: True
//        解释: 1 * 1 + 2 * 2 = 5
        int c=39;
        boolean result = judgeSquareSum(c);

        System.out.println(result);
    }

    public static boolean judgeSquareSum(int c) {
        //        定义两个数a、b，且a<=b
        int a=0;
        int b=(int) Math.sqrt(c);
        boolean result=false;
//        不断进进行计算
        while(a<=b){
            int sum=a*a+b*b;
            if(sum==c){
                result=true;
                break;
            }else if(sum>c){
                b--;
            }else{
                a++;
            }
        }
        return result;
    }
}
