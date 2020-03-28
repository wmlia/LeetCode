package test12;

public class Test1295 {
    public static void main(String[] args) {
//        1295. 统计位数为偶数的数字
//        输入：nums = [12,345,2,6,7896]
//        输出：2
//        解释：
//        12 是 2 位数字（位数为偶数） 
//        345 是 3 位数字（位数为奇数）  
//        2 是 1 位数字（位数为奇数） 
//        6 是 1 位数字 位数为奇数） 
//        7896 是 4 位数字（位数为偶数）  
//        因此只有 12 和 7896 是位数为偶数的数字

        int[] nums={12,345,2,6,7896};
        int num = findNumbers(nums);

        System.out.println(num);

    }

    public static int findNumbers(int[] nums) {
        //        计数
        int num=0;
//        遍历数组
        for (int i = 0; i <nums.length ; i++) {
//            将数字装换为字符串，判断字符串长度
            String s=nums[i]+"";
            if(s.length()%2==0){
                num++;
            }
        }
        return num;
    }
}
