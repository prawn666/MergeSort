import java.util.Arrays;

public class Homework1 {
    public static void sort(Comparable[] a) {
        Comparable[] aux = new Comparable[a.length / 2];
        for (int i = 0; i < aux.length; i++) {
            aux[i] = a[i];
        }
        sort(a, aux, 0, a.length - 1);
    }

    private static void sort(Comparable[] a, Comparable[] aux, int low, int high) {
        if (low >= high) {
            return;
        }

        int mid = low + (high - low) / 2;
        merge(a, aux, low, mid, high);
    }

    private static void merge(Comparable[] a, Comparable[] aux, int low, int mid, int high) {
        if (mid >= aux.length) {
            return;
        }
        int i = 0;
        int j = mid + 1;
        for (int k = 0; k <= high; k++) {
            if (j > high) {
                a[k] = aux[i++];
            } else if (i > mid) {
                a[k] = a[j++];
            } else if (a[j].compareTo(aux[i]) < 0) {
                a[k] = a[j++];
            } else {
                a[k] = aux[i++];
            }
        }
    }

    public static void main(String[] args) {
        Integer[] arr = {4,5,6,1,2,3};
        MergeSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
