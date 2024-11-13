import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        System.out.println(Arrays.toString(array));
//        System.out.println(array.length);

//        array = Arrays.copyOfRange(array, 1,100);
//        System.out.println(Arrays.toString(array));

//        char array[] = new char[10];
//        Arrays.fill(array, 1, 5, 'A');
//        System.out.println(Arrays.toString(array));

        String array[] = {"Pedro", "Ana", "Jefferson", "Maria", "João", "ana"};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.binarySearch(array, "Jefferson"));

    }

}