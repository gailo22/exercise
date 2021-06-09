import java.util.Arrays;

class MergeSort {

    int[] mergeSort(int[] input) {
        if (input.length <= 1) {
            return input;
        }
        
        int mid = input.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(input, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(input, mid, input.length));
        return merge(left, right);
    }

    int[] merge(int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        int[] array = new int[left.length + right.length];
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }
        
        while (i < left.length) {
            array[k++] = left[i++];
        }
        
        while (j < right.length) {
            array[k++] = right[j++];;
        }
        return array;
    }
  
}
