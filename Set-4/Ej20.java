public class NumberUtils {

    public int getSumOfDigits(int number) {
        // Write your code here
        if (number < 0){
            return -1;
        }
        
        int sum = 0;
        while (number > 0){
            sum += number % 10;
            number /= 10;
        }
        
        return sum;
    }
}