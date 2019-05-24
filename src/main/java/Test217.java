import java.lang.reflect.Array;
import java.util.Arrays;

public class Test217 {
    public static void main(String[] args) {
//        217. 存在重复元素
//        给定一个整数数组，判断是否存在重复元素。
//        如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。
//        示例 1:
//        输入: [1,2,3,1]
//        输出: true

//        输入目标数组
        int[]  nums={1,2,3,1};
        boolean result = containsDuplicate(nums);
        System.out.println(result);

    }

    public static boolean containsDuplicate(int[] nums) {
        //        定义结果
        boolean result=false;

//        先将数组进行排序
        Arrays.sort(nums);

//        比较相邻两个数值是否相同
        for (int i = 0; i <nums.length-1 ; i++) {
            if(nums[i]==nums[i+1]){
                result=true;
            }
        }
        return result;
    }
}
