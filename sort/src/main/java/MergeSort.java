public class MergeSort {

    public static int[] aux = null;

    public static void mergeSort(int[] a){
        aux = new int[a.length];
        mergeSort(a,0,a.length-1);
    }

    public static void merge(int[] a, int lo, int mid , int hi){
        int i = lo,j = mid + 1;
        for(int k = lo ; k <= hi ; k ++){
            aux[k] = a[k];
        }
        for(int k = lo ; k <= hi ; k ++){
            if(i > mid) a[k] = aux[j++];
            else if(j > hi) a[k] = aux[i++];
            else if(aux[i] > aux[j]) a[k]= aux[j++];
            else a[k] = aux[i++];
        }
    }

    public static void mergeSort(int[] a, int lo, int hi){
        if(lo >= hi) return;
        int mid = lo + (hi-lo)/2;
        mergeSort(a,lo,mid);
        mergeSort(a,mid+1,hi);
        merge(a,lo,mid,hi);
    }

}
