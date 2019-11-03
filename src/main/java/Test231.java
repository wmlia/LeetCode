public class Test231 {
    public static void main(String[] args) {
//        231. 2的幂
//        给定一个整数，编写一个函数来判断它是否是 2 的幂次方。
        int n = 218;

        boolean result = isPowerOfTwo(n);
        System.out.println(result);

    }

    public static boolean isPowerOfTwo(int n) {
        boolean result = true;
        if (n < 1) {
            result = false;
        } else if (n == 1) {
            result = true;
        } else {
            while (n >= 2) {
                if (n % 2 != 0) {
                    result = false;
                    break;
                }
                n = n / 2;
            }
        }
        return result;
    }
}
