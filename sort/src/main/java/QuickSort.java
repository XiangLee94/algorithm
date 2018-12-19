public class QuickSort {
    public static void sort(int[] a){
        sort(a ,0,a.length-1);
    }

    public static void sort(int[] a, int lo, int hi){
        if(lo >= hi) return;
        int j = partition(a,lo,hi);
        sort(a,lo,j-1);
        sort(a,j+1,hi);
    }

    public static int partition(int [] a,int lo ,int hi){
        int i = lo ,j = hi + 1;
        int key = a[lo];
        while (true){
            while (a[++i] <= key ) if(i == hi) break;
            while (a[--j] >= key ) if(j == lo) break;
            if(i>=j) break;
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
        a[lo] = a[j];
        a[j] = key;
        return j;
    }
}
