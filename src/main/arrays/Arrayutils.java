package src.main.arrays;

public class Arrayutils {
    public void printArray(Integer[] demoArray) {
        for (Integer i : demoArray) {
            System.out.print(i + " ");
        }
    }

    public Integer[] arrayInitialization () {
        //declaration
        Integer[] declaredArray = {2, 5, 6, 7, 5};
        // or Integer[] declaredArray = new Integer[5];
        //update
        declaredArray[0] = 9;
        declaredArray[3] = 2;
        declaredArray[1] = 4;
        declaredArray[4] = 7;
        return declaredArray;
    }

    public static void main(String[] args){
        Arrayutils obj = new Arrayutils();
        obj.printArray(obj.arrayInitialization());
    }
}
