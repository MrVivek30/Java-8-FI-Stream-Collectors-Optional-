import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {


        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

// Using functional programming (Stream API)
        int sum = numbers.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(i->i)
                .sum();
        System.out.println(sum);

        String str = "abcd!";
        IntStream intStream = str.chars(); // Create an IntStream from the string characters

// Convert the IntStream to an array of integers
        int[] charValues = intStream.toArray();

// Print the array elements
        for (int value : charValues) {
            System.out.print(value + " ");
        }
//
//        System.out.println( str.chars().mapToObj(i->(char)i).collect(Collectors.toCollection(ArrayList::new)));

        System.out.println(String.valueOf(str.chars().mapToObj(i->(char)i).collect(Collectors.toCollection(ArrayList::new))));
       List<Character>s= str.chars().mapToObj(i->(char)i).collect(Collectors.toCollection(ArrayList::new));
        System.out.println(s);
//
//        char []arr=str.toCharArray();
//        Arrays.stream(arr).;
    }
}