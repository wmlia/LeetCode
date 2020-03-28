package test2;

public class Test283 {
    public static void main(String[] args) {
//        283. 移动零
//        给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
//        输入: [0,1,0,3,12]
//        输出: [1,3,12,0,0]
//        设置一个index，表示非0数的个数，循环遍历数组，
//        如果不是0，将非0值移动到第index位置,然后index + 1
        int[] nums={0,1,0,3,12};

        moveZeroes(nums);

//        遍历输出
        for (int i = 0; i <nums.length ; i++) {
            System.out.print(nums[i]+"\t");
        }

    }

    public static void moveZeroes(int[] nums) {
        int index=0;
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]!=0){
                nums[index]=nums[i];
                index++;
            }
        }
//        遍历结束之后，index值表示为非0的个数，再次遍历，从index位置后的位置此时都应该为0
        for (int i = index; i <nums.length ; i++) {
            nums[i]=0;
        }
    }
}
