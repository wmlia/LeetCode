package test0;

import java.util.Arrays;

public class Test88 {
    public static void main(String[] args) {
//        88. 合并两个有序数组
//        给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
//        说明:
//        初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
//        你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
//        示例:
//        输入:
//        nums1 = [1,2,3,0,0,0], m = 3
//        nums2 = [2,5,6],       n = 3
//        输出: [1,2,2,3,5,6]

//        原始数组
        int[]  nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m=3;
        int n=3;

        merge(nums1, m,nums2,n);
        for (int i = 0; i <nums1.length; i++) {
            System.out.print(nums1[i]+"\t");
        }

    }

    public static void merge(int[] nums1,int m, int[] nums2,int n) {
        //        定义在数组1开始添加的位置
//        int index=nums2.length;
        int index=m;
//        将数组2加到数组1中
        for (int i = 0; i <nums2.length; i++) {
            nums1[index++]=nums2[i];
        }

//        将数组1进行排序
        Arrays.sort(nums1);
    }
}
