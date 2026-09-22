package Day01;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,2,3,3,3};
        System.out.println(removeDuplicates(arr));
        System.out.println(Arrays.toString(arr));
    }

    static int removeDuplicates(int[] arr){
        int noOfUnique = 1;
        int start = 0;
        int pointer = 1;
        while (pointer<arr.length){
            if (arr[pointer] != arr[start]){
                arr[start + 1] = arr[pointer];
                noOfUnique++;
                start++;
            }
            pointer++;
        }
        return noOfUnique;
    }
}
