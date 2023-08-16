public class FactorialCalculator {

    public int calculateFactorial(int number) {
        // Write your code here
        if (number < 0){
            return -1;
        } 
        
        int result = 1;
        for (int i = 2; i <= number; i++){
            result *= i;
        } 

        return result;
    }
}