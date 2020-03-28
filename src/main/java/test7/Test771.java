package test7;

public class Test771 {
    public static void main(String[] args) {
//        771. 宝石与石头
//         给定字符串J 代表石头中宝石的类型，和字符串 S代表你拥有的石头。 S 中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。
//        J 中的字母不重复，J 和 S中的所有字符都是字母。字母区分大小写，因此"a"和"A"是不同类型的石头。

        String J = "aA";
        String S = "aAAbbbb";
        int result = numJewelsInStones(J, S);

        System.out.println(result);


    }

    public static int numJewelsInStones(String J, String S) {
        int result=0;
        for (int i = 0; i <J.length() ; i++) {
//            拿到J中的每个字符作为匹配字符串
            String a=J.substring(i,i+1);
            for (int j = 0; j < S.length(); j++) {
//                用a跟S中的每个字符去匹配
                String b=S.substring(j,j+1);
                if(a.equals(b)){
                    result++;
                }
            }
        }
        return result;
    }
}
