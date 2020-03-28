package test0;

public class Test28 {
    public static void main(String[] args) {
//        28. 实现strStr()
//        实现 strStr() 函数。
//        给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
//        示例 1:
//        输入: haystack = "hello", needle = "ll"
//        输出: 2

//        要判断的两个字符串
        String haystack = "hello";
        String needle = "ll1";
        int result=strStr(haystack, needle);
        System.out.println(result);

    }

    public static int strStr(String haystack, String needle) {
        //        记录结果
        int result=-1;

//        判断第一次出现的位置
        int index=haystack.indexOf(needle);
        if(index<0){
            result=-1;
        }else {
            result=index;
        }
        return result;
    }
}
