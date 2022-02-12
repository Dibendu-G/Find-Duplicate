package com.company;
import java.util.*;

class Solution1 {
    int[] nums = {4,5,8,6,7,2,4};
    public  int findDuplicate() {
        Arrays.sort(nums);
        for(int i=1; i<nums.length;i++)
        {
            if(nums[i]==nums[i-1])
            {
                return nums[i];
            }
        }
        return -1;
    }
}
public class FindDuplicate {
    public static void main(String[] args) {
        Solution1 sc = new Solution1();
        System.out.println(sc.findDuplicate());
    }
}
