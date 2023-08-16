public class StringMagic {

    /**
     * This method checks if a given string has two consecutive identical characters.
     *
     * @param str The string to check for consecutive duplicates.
     * @return true if the string has consecutive duplicates, false otherwise.
     */
    public boolean hasConsecutiveDuplicates(String str) {
        
        // TODO: Write your code here
        
        /* Ya que se evalúa de izquierda a derecha no debería haber problema con poner 
           a la misma altura str.length()
        */
        
        if (str == null || str.length() < 2){
            return false;
        }
        
        for(int i = 0; i < str.length() - 1; i++ ){
            if(str.charAt(i) == str.charAt(i + 1)){
                return true;
            }
        }
        
        return false;
    }
}