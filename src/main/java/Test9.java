public class Test9 {
    public static void main(String[] args) {
//        9. 回文数
//        判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
        int x=1291;

        boolean result=isPalindrome(x);
        System.out.println(result);
    }

    public static boolean isPalindrome(int x) {

        boolean flag=false;
        if(x<0){
            flag=false;
        }else{
            String s=Integer.toString(x);
            System.out.println(s);
            for (int i = 0; i <=(s.length()-1)/2 ; i++) {
                if(s.charAt(i)==s.charAt(s.length()-1-i)){
                    flag=true;
                }else {
                    flag=false;
                    break;
                }
            }
        }
        return flag;
    }
}
