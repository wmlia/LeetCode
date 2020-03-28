package test9;

public class Test922 {
    public static void main(String[] args) {
//        922. 按奇偶排序数组 II
//        给定一个非负整数数组 A， A 中一半整数是奇数，一半整数是偶数。
//        对数组进行排序，以便当 A[i] 为奇数时，i 也是奇数；当 A[i] 为偶数时， i 也是偶数。
//        你可以返回任何满足上述条件的数组作为答案。
//        输入：[4,2,5,7]
//        输出：[4,5,2,7]
//        解释：[4,7,2,5]，[2,5,4,7]，[2,7,4,5] 也会被接受。

        //        源数组
        int[] A={3,1,2,4};
        int [] result=sortArrayByParityII(A);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+"\t");
        }



    }

    public static int[] sortArrayByParityII(int[] A) {
        //        存放结果的数组
        int[] result=new int[A.length];

//        偶数和奇数的起始索引 odd奇数 even偶数
        int odd=A.length-1;
        int even=0;

//        遍历源数组，放在结果数组中
        for (int i = 0; i <A.length ; i++) {
            if(A[i]%2==0){
                result[even]=A[i];
                even+=2;
            }else{
                result[odd]=A[i];
                odd-=2;
            }
        }

        return result;
    }
}
