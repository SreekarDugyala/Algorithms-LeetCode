package src.main.arrays;

import java.util.Arrays;

public class ReverseArray {
    public Integer[] reverseArray(Integer[] declaredArray){
        int temp = 0;
        int maxIterations = declaredArray.length/2 + declaredArray.length%2;
        int lastIndex = declaredArray.length-1;
        for(int i = 0; i < maxIterations; i++) {
            temp = declaredArray[i];
            declaredArray[i] = declaredArray[lastIndex-i];
            declaredArray[lastIndex-i] = temp;
        }

//        int start = 0;
//        int end = declaredArray.length-1;
//        while (start<end) {
//            temp = declaredArray[start];
//            declaredArray[start] = declaredArray[end];
//            declaredArray[end]=temp;
//            start++;
//            end--;
//
//        }

        return declaredArray;
    }

    public static void main(String[] args) {
        ReverseArray reverse = new ReverseArray();
        System.out.println(Arrays
                .toString(reverse.reverseArray(new Integer[]{4, 2, 5, 6, 7, 7, 8, 3})));
    }
}
