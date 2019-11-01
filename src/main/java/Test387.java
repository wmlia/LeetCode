public class Test387 {
    public static void main(String[] args) {
//        387. 字符串中的第一个唯一字符
//        给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
//        案例:
//        s = "leetcode"
//        返回 0.
//        s = "loveleetcode",
//                返回 2.
        String s = "dda";
        int result = firstUniqChar(s);
        System.out.println(result);
    }

    public static int firstUniqChar(String s) {
        int result = -1;
        for (int i = 0; i < s.length(); i++) {
//            长度为1时
            if (s.length() == 1) {
                result = 0;
                break;
//                长度不为1时且不是最后一位时
            } else if (i != s.length() - 1 && (s.indexOf(s.charAt(i), s.indexOf(s.charAt(i)) + 1)) == -1) {
                result = i;
                break;
//                长度不为1且最后一位唯一时
            }else if(i==s.length()-1&&s.indexOf(s.charAt(i))==s.length()-1){
                result=i;
                break;
            }
        }
        return result;
    }
}
