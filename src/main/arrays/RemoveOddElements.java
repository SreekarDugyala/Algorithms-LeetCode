package src.main.arrays;

import java.util.Arrays;

public class RemoveOddElements {
    public void removeOddElements(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                count++;
            }
        }

        int[] resultArray = new int[count];
        int index = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                resultArray[index++] = num;
            }
        }

        System.out.println(Arrays.toString(resultArray));
    }

    public static void main(String[] args) {
        RemoveOddElements remover = new RemoveOddElements();
        remover.removeOddElements(new int[] {3, 4, 6, 4, 3, 5, 7, 8});
    }
}


//public class RemoveOddElements {
//    public void removeOddElements(int[] nums) {
//        int nextEvenIndex = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] % 2 == 0) {
//                if (i != nextEvenIndex) {
//                    int temp = nums[nextEvenIndex];
//                    nums[nextEvenIndex] = nums[i];
//                    nums[i] = temp;
//                }
//                nextEvenIndex++;
//            }
//        }
//        System.out.println(Arrays.toString(nums));
//        int[] resultArray = Arrays.copyOf(nums, nextEvenIndex);
//        System.out.println(Arrays.toString(resultArray));
//    }
//
//    public static void main(String[] args) {
//        RemoveOddElements remover = new RemoveOddElements();
//        remover.removeOddElements(new int[] {3, 4, 6, 4, 3, 5, 7, 8});
//    }
//}
