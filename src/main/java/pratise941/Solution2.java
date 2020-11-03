package pratise941;

public class Solution2 {
    public boolean validMountainArray(int[] A) {
        int i = 0,N = A.length;
        //递增扫描
        while(i+1<N && A[i]<A[i+1]){
            i++;
        }

        //最高点不能是数组的第一个位置或最后一个位置
        if(i==0 || i == N-1)
            return false;

        while(i+1<N && A[i]>A[i+1])
            i++;
        return i==N-1;
    }
}
