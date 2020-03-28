package test2;

public class Test238 {
    public static void main(String[] args) {
//        238. 除自身以外数组的乘积

//        给定长度为 n 的整数数组 nums，其中 n > 1，返回输出数组 output ，其中 output[i] 等于 nums 中除 nums[i] 之外其余各元素的乘积。
//        示例:
//        输入: [1,2,3,4]
//        输出: [24,12,8,6]

//        原始数组
        int[] nums={1,2,3,4};
       int[] result= productExceptSelf(nums);

        for (int i = 0; i <result.length ; i++) {
            System.out.print(result[i]+"\t");
        }

    }

    public static int[] productExceptSelf(int[] nums) {
        //        定义目标数组
        int[] result=new int[nums.length];
//        定义暂存之积
        int sum=1;

        for (int i = 0; i <nums.length ; i++) {
            for (int j = 0; j <nums.length ; j++) {
                if(i!=j){
                    sum*=nums[j];
                }
            }
            result[i]=sum;
            sum=1;
        }

        return result;
    }
}
