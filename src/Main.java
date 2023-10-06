import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        byte[] byteArr = { 10, 20, 15, 22, 35 };
        char charArr[] = { 'g', 'p', 'q', 'c', 'i' };
        int intArr[] = { 10, 20, 15, 22, 35 };
        double doubleArr[] = { 10.2, 15.1, 2.2, 3.5 };
        float floatArr[] = { 10.2f, 15.1f, 2.2f, 3.5f };
        short shortArr[] = { 10, 20, 15, 22, 35 };

        Arrays.sort(byteArr);
        Arrays.sort(charArr);
        Arrays.sort(intArr);
        Arrays.sort(doubleArr);
        Arrays.sort(floatArr);
        Arrays.sort(shortArr);

        byte byteKey = 35;
        char charKey = 'g';
        int intKey = 22;
        double doubleKey = 1.5;
        float floatKey = 35;
        short shortKey = 5;

        System.out.println(
                byteKey + " found at index = "
                        + Arrays.binarySearch(byteArr, byteKey));
        System.out.println(
                charKey + " found at index = "
                        + Arrays.binarySearch(charArr, charKey));
        System.out.println(
                intKey + " found at index = "
                        + Arrays.binarySearch(intArr, intKey));
        System.out.println(
                doubleKey + " found at index = "
                        + Arrays.binarySearch(doubleArr, doubleKey));
        System.out.println(
                floatKey + " found at index = "
                        + Arrays.binarySearch(floatArr, floatKey));
        System.out.println(
                shortKey + " found at index = "
                        + Arrays.binarySearch(shortArr, shortKey)+"\n");


        List<Integer> al = new ArrayList<Integer>();
        al.add(12);
        al.add(53);
        al.add(23);
        al.add(46);
        al.add(54);

        int index = Collections.binarySearch(al, 23);
        System.out.print(index);
    }
}