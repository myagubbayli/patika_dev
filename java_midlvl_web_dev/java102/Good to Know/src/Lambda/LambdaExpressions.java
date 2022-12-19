package Lambda;
import java.util.function.BiFunction;

public class LambdaExpressions {
    public static void main(String[] args) {
        // Define a lambda expression that takes two integers and returns their sum
        BiFunction<Integer, Integer, Integer> add = (x, y) -> x + y;

        // Use the lambda expression to compute the sum of two integers
        int result = add.apply(1, 2);
        System.out.println(result); // Outputs 3
    }
}