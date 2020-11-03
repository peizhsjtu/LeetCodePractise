package pratise941;

/**
 * 941. 给定一个整数数组 A，如果它是有效的山脉数组就返回 true，否则返回 false。
 *
 * 注意用例:[9,8,7,6,5,4,3,2,1,0]
 */
public class Solution1 {
    public boolean validMountainArray(int[] A) {
        if (A.length<3)
                return false;
        int temp = 0;
        for(int i = 0;i < A.length-1;i++){
            if(A[i]==A[i+1])
                return false;
            else if(A[i]>A[i+1]){
               temp = i;
               break;
            }
        }
        if(temp ==0)
            return false;
        for(int i = temp;i<A.length-1;i++){
            if(A[i]<=A[i+1])
                return false;
        }
        return true;

    }
}
