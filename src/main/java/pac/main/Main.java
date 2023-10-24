package pac.main;

import java.util.ArrayList;

public class Main {

    public static <T, E> boolean compareArrays(T[] arr1, E[] arr2){
        if ((arr1.getClass() == arr2.getClass()) && (arr1.length == arr2.length)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        // задание 1.
        Calculate calc = new Calculate();
        System.out.println(calc.sum(10, 2.5)); // 12.5
        System.out.println(calc.multiply(10, 2.5)); // 25.0
        System.out.println(calc.divide(10, 2.5)); // 4.0
        System.out.println(calc.subtract(10, 2.5)); // 7.5

        // задание 2.
        String[] arr1 = new String[] {"1", "2", "3"};
        Calculate[] arr2 = new Calculate[1];
        System.out.println(compareArrays(arr1, arr2)); // false
        Calculate[] arr3 = new Calculate[1];
        System.out.println(compareArrays(arr2, arr3)); // true

        // задание 3.
        ArrayList<Integer> second = new ArrayList<>();
        second.add(1);
        second.add(2);
        second.add(3);
        Pair pair = new Pair("text", second);
        System.out.println(pair.getFirst()); // text
        System.out.println(pair.getSecond()); // [1, 2, 3]
        System.out.println(pair);  // First: text; Second: [1, 2, 3]


    }
}