import java.util.Arrays;
import java.util.Scanner;
public class SortedArray {
    public static void main(String[] args) {
        int[] getInteger = getIntegers(5);
        int[] sortInteger = sortIntegers(getInteger);
        printArray(sortInteger);

    }
    public static Scanner scanner = new Scanner(System.in);

    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " Numbers");
        int[] array = new int[number];
        for (int i=0; i<array.length; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }
    public static void printArray(int[] array){
        for (int i=0; i< array.length; i++){
            System.out.println("Element "+ i + " contents " + array[i]);
        }
    }
    public static int[] sortIntegers(int[] array){
        int[] sortedArray =  Arrays.copyOf(array,array.length);
        int tem;
        boolean flag = true;
        while (flag){
            flag = false;
            for (int i=0; i< sortedArray.length-1; i++){
                if (sortedArray[i] < sortedArray[i+1]){
                    tem = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = tem;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}
