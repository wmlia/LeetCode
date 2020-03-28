public class Test1323 {
    public static void main(String[] args) {
//        1323. 6 和 9 组成的最大数字
//        给你一个仅由数字 6 和 9 组成的正整数 num。
//        你最多只能翻转一位数字，将 6 变成 9，或者把 9 变成 6 。
//        请返回你可以得到的最大数字。
        int num = 9669;
        int newNum = maximum69Number(num);

        System.out.println(newNum);
    }

    public static int maximum69Number(int num) {
        //        这个题的意思就是找出第一个6的位置，替换成9
        String s=num+"";
//        找出第一个6的位置
        int index=s.indexOf("6");
//        定义结果
        String result="";
//        遍历s
        for (int i = 0; i <s.length(); i++) {
            if(i==index){
                result+='9';
            }else {
                result+=s.charAt(i);
            }
        }
//        最后将result变成int
        return Integer.parseInt(result);
    }
}
