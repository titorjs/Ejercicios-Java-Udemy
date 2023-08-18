import java.util.List;
import java.util.Optional;

public class FunctionalProgrammingMagic {

    public static int findMaxEvenNumber(List<Integer> numbers) {
        return (numbers == null ? 0 :
                numbers.stream().filter(n -> n%2 == 0).max(Integer::compare).orElse(0));
    }
}