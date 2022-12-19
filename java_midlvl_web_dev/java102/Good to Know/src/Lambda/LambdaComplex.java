package Lambda;
import java.util.function.BiFunction;
import java.util.function.Function;

public class LambdaComplex {
    public static void main(String[] args) {
        // Define a lambda expression that a string and an integer, and returns the concatenation 
        // of the string and the integer
        BiFunction<String, Integer, String> concat = (s, n) -> s + n;

        // Use the lambda expression to concatenate a string and an integer
        String result = concat.apply("The answer is ", 42);
        System.out.println(result); // Outputs "The answer is 42"

        // Define a lambda expression that takes a string and returns its length
        Function<String, Integer> length = s -> s.length();

        // Use the lambda expression to compute the length of a string 
        int len = length.apply("Hello, world!");
        System.out.println(len); // Outputs 13
    }
}
