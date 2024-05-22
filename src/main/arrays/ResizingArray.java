package src.main.arrays;

public class ResizingArray {
    public int[] resizeArray(int[] givenArray, int resizeValue){
        int[] temp = new int[resizeValue];
        for(int i=0; i<givenArray.length; i++){
            temp[i]=givenArray[i];
        }
        return temp;
    }

    public static void main(String[] args) {
        ResizingArray rs = new ResizingArray();
        int[] originalArray = {4,5,6,7,8};
        System.out.println(originalArray.length);
        originalArray = rs.resizeArray(originalArray, 10);
        System.out.println(originalArray.length);
    }
}
