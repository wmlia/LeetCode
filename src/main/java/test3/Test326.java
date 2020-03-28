package test3;

public class Test326 {
    public static void main(String[] args) {
//        326. 3的幂
//        给定一个整数，编写一个函数来判断它是否是 3 的幂次方。
        int n = 45;

        boolean result = isPowerOfThree(n);
        System.out.println(result);

    }

    public static boolean isPowerOfThree(int n) {
        boolean result = true;
        if (n < 1) {
            result = false;
        } else if (n == 1) {
            result = true;
        } else {
            while (n >= 2) {
                if (n % 3 != 0) {
                    result = false;
                    break;
                }
                n = n / 3;
            }
        }
        return result;
    }
}
