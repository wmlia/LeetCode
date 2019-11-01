public class Test125 {
    public static void main(String[] args) {
//        125. 验证回文串
//        给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
//        说明：本题中，我们将空字符串定义为有效的回文串。
//        示例 1:
//        输入: "A man, a plan, a canal: Panama"
//        输出: true
        String s="A man, a plan, a canal: Panama";
        boolean result = isPalindrome(s);
        System.out.println(result);
    }

    public static boolean isPalindrome(String s) {
        //        将字母转为小写
        s=s.toLowerCase();
        char[] chs=s.toCharArray();
        char[] newChs;
        String ns="";
        boolean result=true;
//        取出合法的字符
        for (int i = 0; i <chs.length; i++) {
            if((chs[i]>='a'&&chs[i]<='z')||(chs[i]>='0'&&chs[i]<='9')){
                ns+=chs[i];
            }
        }
//        将string转为char数组
        newChs=ns.toCharArray();
//        比对
        for (int i = 0; i <newChs.length-1 ; i++) {
            if(newChs[i]!=newChs[newChs.length-i-1]){
                result=false;
                break;
            }
        }
        return result;
    }
}
