public class Test1365 {
    public static void main(String[] args) {
//        1365. 有多少小于当前数字的数字

//        给你一个数组 nums，对于其中每个元素 nums[i]，请你统计数组中比它小的所有数字的数目。
//        换而言之，对于每个 nums[i] 你必须计算出有效的 j 的数量，其中 j 满足 j != i 且 nums[j] < nums[i] 。
//        以数组形式返回答案。

//        输入：nums = [8,1,2,2,3]
//        输出：[4,0,1,1,3]
//        解释：
//        对于 nums[0]=8 存在四个比它小的数字：（1，2，2 和 3）。
//        对于 nums[1]=1 不存在比它小的数字。
//        对于 nums[2]=2 存在一个比它小的数字：（1）。
//        对于 nums[3]=2 存在一个比它小的数字：（1）。
//        对于 nums[4]=3 存在三个比它小的数字：（1，2 和 2）。

        int[] nums={8,1,2,2,3};

        int[] result = smallerNumbersThanCurrent(nums);

//        打印下result
        for (int i = 0; i <result.length ; i++) {
            System.out.print(result[i]+"\t");
        }

    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result=new int[nums.length];

        int num=0;

//        遍历nums
        for (int i = 0; i <nums.length ; i++) {
//            遍历比较比他小的数字，如果小就加1
            for (int j = 0; j <nums.length ; j++) {
//                首先不能跟自己比较
                if(i!=j){
                    if(nums[i]>nums[j]){
                        num++;
                    }
                }
                result[i]=num;
            }
//            比较完之后，重置下num=0
            num=0;
        }
        return result;
    }
}
