package src.main.arrays;

public class MinValueOfArray {
    public Integer minValue(Integer[] declaredArray) {
        int min = declaredArray[0];
        int al = declaredArray.length;
        int k = al/2 + al%2;
        for(int i=0; i <k; i++) {
            if(declaredArray[i] < min || declaredArray[al-1-i] < min){
                if(declaredArray[i] <declaredArray[al-1-i]){
                    min = declaredArray[i];
                }
                else {
                    min = declaredArray[al-1-i];
                }
            }
        }
        return min;
    }

    public static void main(String[] args) {
        MinValueOfArray obj = new MinValueOfArray();
        System.out.println(obj.minValue(new Integer[]{5,9,5,5,4,3,2}));
    }
}
