public class SimpleSort {
    public static void insertSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int temp = a[i];
            int j = i - 1;
            while (j > -1 && a[j] >= temp) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = temp;
        }
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {//-1为了防止溢出
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];

                    arr[j] = arr[j + 1];

                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void selectSort(int[] a) {
        int minIndex = 0;
        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            minIndex = i;//无序区的最小数据数组下标
            for (int j = i + 1; j < a.length; j++) {
                //在无序区中找到最小数据并保存其数组下标
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            //将最小元素放到本次循环的前端
            temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
        }
    }
}
