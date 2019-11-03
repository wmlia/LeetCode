import java.lang.reflect.Array;
import java.util.Arrays;

public class Test35 {
    public static void main(String[] args) {
//        35. 搜索插入位置
//        给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
//        你可以假设数组中无重复元素。
        int[] nums = {1, 3, 5, 6};
        int target = 7;

        int result = searchInsert(nums, target);


        System.out.println(result);
    }

    public static int searchInsert(int[] nums, int target) {
        int[] newNums = new int[nums.length + 1];
        int result = 0;
            for (int i = 0; i < nums.length; i++) {
                newNums[i] = nums[i];
            }
            //            把新元素加入
            newNums[nums.length] = target;
//            对新数组进行排序
            Arrays.sort(newNums);
//            二分查找有可能导致多个相同值位置错误
//            result = Arrays.binarySearch(newNums, target);
        //            遍历新数组，查找位置
        if (target <= nums[0]){
            result=0;
        }else if(target > nums[nums.length - 1]){
            result=nums.length;
        }else{
            for (int i = 0; i <newNums.length ; i++) {
                if(newNums[i]==target){
                    result=i;
                    break;
                }
            }
        }
        return result;
    }
}
