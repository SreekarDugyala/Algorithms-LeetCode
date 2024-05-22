package src.main.arrays;

public class MissingNumber {
    public int missingNumber(int[] givenArray) {
        int arrayLength = givenArray.length;
        //[n*(n+1)]/2
        int numberSum = ((arrayLength+1)*(arrayLength+2))/2;
        for(int i = 0; i < arrayLength; i++) {
            numberSum-=givenArray[i];
        }
        return numberSum;
    }

    public static void main(String[] args) {
        MissingNumber ms = new MissingNumber();
        int missedNumber = ms.missingNumber(new int[] {1, 2, 3, 4, 6, 7, 8, 9});
        System.out.println(missedNumber);
    }
}
