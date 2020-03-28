package test7;

public class Test709
{
    public static void main(String[] args) {
//        709. 转换成小写字母
//        源字符串
        String str="LOVELY";
        String result = toLowerCase(str);

        System.out.println(result);
    }

    public static String toLowerCase(String str) {
        //        目标字符串
        String result;

        result=str.toLowerCase();
        return result;
    }
}
