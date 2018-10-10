package eightplus;

public class Solution896 {
    public boolean isMonotonic(int[] A) {
        boolean up = true;
        boolean down = true;
        for(int i= 0;i < A.length -1 ;i ++){
            if(A[i] > A[i+1])
                down =false;
            if(A[i] < A[i+1])
                up =false;
        }
        return up || down;
    }
}
