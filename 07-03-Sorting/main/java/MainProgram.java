
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        System.out.println("Smallest: " + MainProgram.smallest(array));
        System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(array) + "\n");

        int[] numbers = {-1, 6, 9, 8, 12};
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 0));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 1));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 2) + "\n");

        int[] numbers1 = {3, 2, 5, 4, 8};

        System.out.println(Arrays.toString(numbers1));

        MainProgram.swap(numbers1, 1, 0);
        System.out.println(Arrays.toString(numbers1));

        MainProgram.swap(numbers1, 0, 3);
        System.out.println(Arrays.toString(numbers1) + "\n");

        int[] numbers2 = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers2);
    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
            }
        }

        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int smallest = array[0]; // Assume que o primeiro elemento é o menor
        int index = 0; // Índice do menor valor

        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i]; // Atualiza o menor valor
                index = i; // Atualiza o índice do menor valor
            }
        }

        return index;
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int smallest = array[startIndex];
        int indexOfSmallest = startIndex;
        for (int i = startIndex; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
                indexOfSmallest = i;
            }
        }

        return indexOfSmallest;
    }

    public static void swap(int[] array, int index1, int index2) {
        int holder1 = array[index1];
        int holder2 = array[index2];
        array[index1] = holder2;
        array[index2] = holder1;

    }

    public static void sort(int[] array) {
        int index = 0;
        while (index < array.length) {
            System.out.println(Arrays.toString(array));
            int nextNumber = indexOfSmallestFrom(array, index);
            swap(array, index, nextNumber);

            index++;
        }

    }
}
