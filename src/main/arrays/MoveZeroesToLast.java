package src.main.arrays;

import java.util.Arrays;

public class MoveZeroesToLast {

    public Integer[] moveZeroes(Integer[] declaredArray){
        int arrayLength = declaredArray.length;
        int j = 0;
        int temp = 0;
        for(int i = 0; i<arrayLength; i++) {
            if(declaredArray[i]!=0 && declaredArray[j]== 0) {
                temp = declaredArray[i];
                declaredArray[i] = declaredArray [j];
                declaredArray[j] = temp;
            }

            if(declaredArray[j]!=0) {
                j++;
            }
        }
        return declaredArray;
    }

    public static void main(String[] args) {
        MoveZeroesToLast mz = new MoveZeroesToLast();
        System.out.println(Arrays.toString(mz.moveZeroes(new Integer[]{3, 7, 8, 10, 0, 0})));
    }
}
