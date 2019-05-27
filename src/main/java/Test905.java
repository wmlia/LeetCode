public class Test905 {
    public static void main(String[] args) {
//        905 按奇偶排序数组
//        给定一个非负整数数组 A，返回一个数组，在该数组中， A 的所有偶数元素之后跟着所有奇数元素。
//        你可以返回满足此条件的任何数组作为答案。
//        示例：
//        输入：[3,1,2,4]
//        输出：[2,4,3,1]
//        输出 [4,2,3,1]，[2,4,1,3] 和 [4,2,1,3] 也会被接受。
//        源数组
        int[] A={3,1,2,4};
        int [] result=sortArrayByParity(A);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+"\t");
        }



    }

    public static int[] sortArrayByParity(int[] A) {
        //        存放结果的数组
        int[] result=new int[A.length];

//        偶数和奇数的起始索引 odd奇数 even偶数
        int odd=A.length-1;
        int even=0;

//        遍历源数组，放在结果数组中
        for (int i = 0; i <A.length ; i++) {
            if(A[i]%2==0){
                result[even++]=A[i];
            }else{
                result[odd--]=A[i];
            }
        }

        return result;
    }
}
