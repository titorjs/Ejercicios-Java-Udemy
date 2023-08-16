import java.util.ArrayList;
import java.util.List;

public class NumberMagic {
    /**
     * This method generates a list of multiples of a given number less than a specified limit.
     * 
     * @param number the number to find multiples of
     * @param limit the upper bound for the multiples
     * @return a List of multiples of the number less than the limit
     */
    public List<Integer> determineMultiples(int number, int limit) {

        List<Integer> res = new ArrayList<>();
        
        if (number <= 0 || limit <= 0){
            return res;
        }
        
        int aux = number;
        
        while(aux < limit) {
            res.add(aux);
            aux += number;
        }
        
        return res;
        
    }
}