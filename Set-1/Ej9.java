public class PerfectNumberChecker {
    public boolean isPerfectNumber(int number) {
        if (number <= 0)
            return false;
        int sum = 1;
        for(int i = 2; i <= number/2; i++){
            if(number%i == 0)
                sum += i;
        }
        return sum == number;
    }
}