public class StringMagic {

    /**
     * This method finds the rightmost digit in a given string.
     *
     * @param str The string to find the rightmost digit in.
     * @return The rightmost digit in the string. If no digit is found, return -1.
     */
    public int getRightmostDigit(String str) {

        // TODO: Write your code here
        
        if(str == null || str.isEmpty()){
            return -1;
        }
        
        int num = -1;
        
        for(int i = 0; i < str.length(); i++){
            char aux = str.charAt(i);
            if(Character.isDigit(aux)){
                num = Character.getNumericValue(aux);
            }
        }
        
        return num;
    }
}