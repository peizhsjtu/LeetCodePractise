package practise349;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 349. 两个数组的交集
 * 给定两个数组，编写一个函数来计算它们的交集。
 *
 * 思路:此题对于Java来说解题可以通过将数组转化为set进行去重,但是要注意
 * set添加元素只能通过add()方法添加,set通过retainAll()方法获取交集,
 * 在获取交集以后,通过new 数组来添加元素,感觉很麻烦.
 *
 */
public class Solution1 {
    public static void main(String[] args) {
        int[] nums1 = new int[]{2,4,6,8,2};
        int[] nums2 = new int[]{3,5,9,10,2,4,2};

        //下面是正式代码

        Set<Integer> hashSet1 = new HashSet<Integer>();
        Set<Integer> hashSet2 = new HashSet<Integer>();

        for(int num:nums1){
            hashSet1.add(num);
        }

        for(int num:nums2){
            hashSet2.add(num);
        }

        hashSet1.retainAll(hashSet2);

        int[] result = new int[hashSet1.size()];
        int i = 0;

        for(Integer ele : hashSet1){
            result[i++] = ele;
        }
    }
}
