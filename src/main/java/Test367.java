public class Test367 {
    public static void main(String[] args) {
//        367. 有效的完全平方数
//        给定一个正整数 num，编写一个函数，如果 num 是一个完全平方数，则返回 True，否则返回 False。
//        说明：不要使用任何内置的库函数，如  sqrt。
        int num = 16;
        boolean result = isPerfectSquare(num);
        System.out.println(result);

    }

    public static boolean isPerfectSquare(int num) {
//        注意1是完全平方数
        boolean result = false;
        if (num == 1) {
            result = true;
        } else {
            for (int i = 1; i <= num / 2; i++) {
                if (i * i == num) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }
}

