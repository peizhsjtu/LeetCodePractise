package practicse1;

import java.util.HashMap;
import java.util.Map;

/**
 * 1.两数之和
 * 给定一个整数数组 nums和一个目标值 target，请你在该数组中找出和为目标值的那
 * 两个整数，并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * =========================================
 * 解题思路: 这题如果用遍历法则需要进行两次for循环，复杂度为n2
 * 考虑使用
 */
public class Solution1 {
    public static void main(String[] args) {
        int[] nums = new int[]{3,2,4};
        int target = 6;

        Solution1 solution1 = new Solution1();
        int[] res = solution1.twoSum(nums, target);
        for(int e:res){
            System.out.println(e);
        }

    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i< nums.length;i++){
            int res = target - nums[i];
            if(map.containsKey(res)){
                return new int[]{map.get(res), i};
            }
            map.put(nums[i],i);
        }

        return null;
    }
}
