package src.main.arrays;

public class SecondMaxOfArray {
    public int secondMax(Integer[] declaredArray) {
        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int arrayLength = declaredArray.length;
        for(int i = 0; i < arrayLength; i++){
            if(declaredArray[i]>max){
                second = max;
                max = declaredArray[i];
            }
            else{
                if(declaredArray[i]>second && declaredArray[i] != max){
                    second=declaredArray[i];
                }
            }
        }
        return second;
    }

    public static void main(String[] args) {
        SecondMaxOfArray sa = new SecondMaxOfArray();
        System.out.println(sa.secondMax(new Integer[]{34,5,25,34,33,22}));
    }
}
