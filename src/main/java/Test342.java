public class Test342 {
    public static void main(String[] args) {
//        342. 4的幂
//        给定一个整数，编写一个函数来判断它是否是 2 的幂次方。
        int num = 5;

        boolean result = isPowerOfFour(num);
        System.out.println(result);

    }

    public static boolean isPowerOfFour(int num) {
        boolean result = true;
        if (num < 1) {
            result = false;
        } else if (num == 1) {
            result = true;
        } else {
            while (num >= 2) {
                if (num % 4 != 0) {
                    result = false;
                    break;
                }
                num = num / 4;
            }
        }
        return result;
    }
}
