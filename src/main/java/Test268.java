import java.util.Arrays;

public class Test268 {
    public static void main(String[] args) {
//        268缺失数字
//        给定一个包含 0, 1, 2, ..., n 中 n 个数的序列，找出 0 .. n 中没有出现在序列中的那个数
        int[] nums={9,6,4,2,3,5,0,7,1};
        int result = missingNumber(nums);
        System.out.println(result);

    }

    public static int missingNumber(int[] nums) {
//        算出0到最大值的和，然后减去实际的和就是缺少的数字
        int max=nums.length+1;
        int sum=0;
        int realSum=0;
        for (int i = 0; i <max ; i++) {
            sum+=i;
            if(i!=max-1){
                realSum+=nums[i];
            }
        }
        return sum-realSum;
    }
}
