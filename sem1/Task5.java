package sem1;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {

        int[] nums = {4, 5, 2, 4, 5, 2, 45, 67, 1, 4, 2};
        int val = 4;
        System.out.println(Arrays.toString(shuffleArr(nums, val)));
        

    }    
    public static int[] shuffleArr(int[] arr, int value) {
        int temp = 0;
        int k = arr.length - 1;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == value) {
                    if (arr[i] == arr[k]) k -= 1;
                    temp = arr[i];
                    arr[i] = arr[k];
                    arr[k] = temp;
                    k -= 1;
                }
                if (i == k) break;

            }
            return arr;
    }
}
