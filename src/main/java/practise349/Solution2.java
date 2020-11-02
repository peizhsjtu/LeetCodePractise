package practise349;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 双指针

 先将 nums1nums1 与 nums2nums2 排序，然后游走两个指针，情况都写出来了，没有用 else
 时间复杂度：O(nlogn)
 Java
 */

class Solution2 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<Integer>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                set.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            }
        }
        int[] res = new int[set.size()];
        int index = 0;
        for (int num : set) {
            res[index++] = num;
        }
        return res;
    }
}


