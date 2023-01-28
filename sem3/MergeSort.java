package sem3;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] n = { 4, 2, 5, 7, 8, 1, 3, 23, 5, 13, 23 };
        System.out.println(Arrays.toString(sortArray(n)));
    }
    public static int[] sortArray(int[] array) {
        if (array == null) {
            return null;
        }
        if (array.length < 2) {
            return array;
        }
   
        int[] tempArr1 = new int[array.length / 2];
        System.arraycopy(array, 0, tempArr1, 0, array.length / 2);
   
        int[] tempArr2 = new int[array.length - tempArr1.length];
        System.arraycopy(array, tempArr1.length, tempArr2, 0, array.length - tempArr1.length);
   
        sortArray(tempArr1);
        sortArray(tempArr2);
   
        mergeArray(array, tempArr1, tempArr2);
   
        return array;
    }
   
    private static void mergeArray(int[] array, int[] tempArr1, int[] tempArr2) {
   
        int pos1 = 0;
        int pos2 = 0;
   
        for (int c = 0; c < array.length; c++) {
            if (pos1 == tempArr1.length) {
                array[c] = tempArr2[pos2];
                pos2++;
            } else if (pos2 == tempArr2.length) {
                array[c] = tempArr1[pos1];
                pos1++;
            } else if (tempArr1[pos1] < tempArr2[pos2]) {
                array[c] = tempArr1[pos1];
                pos1++;
            } else {
                array[c] = tempArr2[pos2];
                pos2++;
            }
        }
    }
}
