package test8;

public class Test832 {
    public static void main(String[] args) {
//        832. 翻转图像
//        给定一个二进制矩阵 A，我们想先水平翻转图像，然后反转图像并返回结果。
//        水平翻转图片就是将图片的每一行都进行翻转，即逆序。例如，水平翻转 [1, 1, 0] 的结果是 [0, 1, 1]。
//        反转图片的意思是图片中的 0 全部被 1 替换， 1 全部被 0 替换。例如，反转 [0, 1, 1] 的结果是 [1, 0, 0]。
//        输入: [[1,1,0],[1,0,1],[0,0,0]]
//        输出: [[1,0,0],[0,1,0],[1,1,1]]
//        解释: 首先翻转每一行: [[0,1,1],[1,0,1],[0,0,0]]；
//        然后反转图片: [[1,0,0],[0,1,0],[1,1,1]]

//        int[][] A = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        int[][] A = {{1, 1, 0, 0}, {1, 0, 0, 1}, {0, 1, 1, 1}, {1, 0, 1, 0}};

        flipAndInvertImage(A);

    }

    public static void printArray(int[][] a) {
        //        打印数组
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println("第" + (i + 1) + "行");
        }
    }


    public static int[][] flipAndInvertImage(int[][] A) {
        //        定义一个临时变量
        int temp = 0;
//        遍历数组，按照要求去翻转数字

//        水平翻转,即逆序
        for (int i = 0; i < A.length; i++) {
//            获取每行数组.遍历数组，然后逆序
            for (int j = 0; j < A[i].length / 2; j++) {
                temp = A[i][j];
                int x = j;
                System.out.print(A[i][j] + "\t" + "这个是" + j + "j\t");
                A[i][j] = A[i][A[i].length - j - 1];
                int y = A[i].length - j - 1;
                System.out.println(A[i][j] + "\t");
                A[i][A[i].length - j - 1] = temp;
//                }
            }
        }

        System.out.println("第一次翻转打印");
//        printArray(A);

//        翻转图片
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                if (A[i][j] == 1) {
                    A[i][j] = 0;
                } else {
                    A[i][j] = 1;
                }
            }
        }
        System.out.println();
        System.out.println("第二次反转打印");
        printArray(A);
        return A;
    }
}