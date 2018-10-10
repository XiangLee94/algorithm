public class SortTest {
    public static void main(String[] args) {
        int[] a = new int[]{1,4,52,2,7,6,88,23,584,1,22,3,2,6,6,5,5};
        MergeSort.mergeSort(a);
        for(int i = 0 ; i < a.length ; i ++){
            System.out.println(a[i]);
        }
    }
}
