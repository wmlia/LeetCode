import java.util.ArrayList;

public class Test66 {
    public static void main(String[] args) {
//        给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
//        最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。
//        你可以假设除了整数 0 之外，这个整数不会以零开头。

        int[] digits={9,8,7,6,5,4,3,2,1,0};
        int[] result = getString(digits);

        for (int i = 0; i <result.length ; i++) {
            System.out.print(result[i]+"\t");
        }
//        System.out.println(result);
    }

    public static int[] getString(int[] digits) {
        //        记录原始数据之和
        int sum=0;
        for (int i = 0; i <digits.length ; i++) {
            sum+=digits[i]*Math.pow(10,digits.length-1-i);
        }

//        加1后的数字之和
        sum++;
        System.out.println(sum);
//        将数字之和转换为字符串
        String b=String.valueOf(sum);

//        定义结果数组
        int[] result=new int[b.length()];

//        拼接成所要的结果
        for (int i = 0; i <b.length(); i++) {
//            将char转为字符串
            String s=String.valueOf(b.charAt(i));
//            将字符串转为数字
            result[i]=Integer.parseInt(s);
        }
        return result;
    }
}
