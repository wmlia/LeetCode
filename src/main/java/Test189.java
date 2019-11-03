import java.util.logging.Level;

public class Test189 {
    public static void main(String[] args) {
//        189. 旋转数组
//        给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
//        输入: [1,2,3,4,5,6,7] 和 k = 3
//        输出: [5,6,7,1,2,3,4]
        int[] nums = {1, 2};
        int k = 3;
        rotate(nums, k);
    }

    public static void rotate(int[] nums, int k) {
//        新建一个数组，移动后的数组放到新的去
        int[] result=new int[nums.length];
//        如果移动的次数大于数组长度，对移动次数重新赋值
        if(k>=nums.length){
            k=k%nums.length;
        }

//        遍历数组
        for (int i = 0; i <nums.length ; i++) {
            if(i>=k){
                result[i]=nums[i-k];
            }else {
                result[i]=nums[nums.length-k+i];
            }
        }
        for (int i = 0; i <result.length ; i++) {
            nums[i]=result[i];
        }

//        for (int i = 0; i <result.length ; i++) {
//            System.out.print(result[i]+"\t");
//        }
    }
}
