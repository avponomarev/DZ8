import java.util.Arrays;
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int length;
        System.out.println("Введите размер массива");
        length = scanner.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Введите " + i + " -ое число ");
            array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            array[i] *= 2;
        }
        System.out.println(Arrays.toString(array));
    }
}
