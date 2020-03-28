package test0;

public class Test7 {
    public static void main(String[] args) {
        int x=-2147483648;
        int y=reverse(x);
        System.out.println(y);
    }

    public static int reverse(int x) {
        //        记录数据是正负数
        String index="";
//        定义结果数据
        int z;
//        判断是否是正数，负数的记录下
        if(x<0){
            index+="-";
        }

//        将数据取个绝对值,-2147483648去绝对值还是自己
//        x=Math.abs(x);

//        将数字翻转
        String s=String.valueOf(x);
        String result="";
        for (int i = 0; i <s.length() ; i++) {
            result+=s.charAt(s.length()-i-1);
        }
//        result=index+result;

//        若是负数，去掉翻转后的负号,前边加上符号
        if(index.equals("-")){
            result=index+result.substring(0,result.length()-1);
        }

//        将字符串转换为数字
        double y=Double.parseDouble(result);

//        判断是否超出整数范围 [−231,  231 − 1]
        if(y>Math.pow(2,31)-1||y<Math.pow(-2,31)){
            z=0;
        }else {
            z=(int)y;
        }
        return z;
    }
}
