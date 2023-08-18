import java.util.List;

public class FunctionalProgrammingMagic {

    public static long sumOfSquares(List<Integer> numbers) {
        
        // Check if the list is null. If so, return 0.
        
        return (numbers == null ? 0l :

        // Stream over the list of numbers, find squares and sum them up
        
                numbers.stream().mapToLong(n -> n * n).reduce(0, (n1, n2) -> n1 + n2));
    }
}