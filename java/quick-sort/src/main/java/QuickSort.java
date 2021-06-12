import java.util.Arrays;

class QuickSort {

    int[] quickSort(int[] input) {
        return quickSort(input, 0, input.length - 1);
    }

    int[] quickSort(int[] input, int start, int end) {
        if (start < end) {
            int pIndex = partition(input, start, end);
            quickSort(input, start, pIndex - 1);
            quickSort(input, pIndex + 1, end);
        }
        return input;
    }

    int partition(int[] input, int start, int end) {
        int pivot = input[end];
        int pIndex = start;
        for (int i = start; i < end; i++) {
            if (input[i] < pivot) {
                swap(input, i, pIndex++);
            }
        }

        swap(input, pIndex, end);

        return pIndex;
    }

    void swap(int[] input, int a, int b) {
        int tmp = input[a];
        input[a] = input[b];
        input[b] = tmp;
    }
  
}
