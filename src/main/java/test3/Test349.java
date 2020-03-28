package test3;

import java.util.TreeSet;

public class Test349 {
    public static void main(String[] args) {
//        349. 两个数组的交集
//        给定两个数组，编写一个函数来计算它们的交集。
//        示例 1:
//        输入: nums1 = [1,2,2,1], nums2 = [2,2]
//        输出: [2]

//        目标数组
        int[] nums1={4,9,5};
        int[] nums2={9,4,9,8,4};
        int[] result=intersection(nums1, nums2);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        //        因为要唯一，先存放在treeset中，再存放在result数组中
        TreeSet<Integer> ts=new TreeSet<Integer>();
//        遍历查找重复项
        for (int i = 0; i <nums1.length ; i++) {
            for (int j = 0; j <nums2.length ; j++) {
                if(nums1[i]==nums2[j]){
                    ts.add(nums1[i]);
                }
            }
        }

//        结果数组
        int[] result=new int[ts.size()];
//        定义循环变量
        int index=0;

//        遍历treeSet，放到result
        for (Integer i:ts ) {
                result[index++]=i;
        }

        return result;
    }
}
