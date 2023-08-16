public class ArrayMagic {

    /**
     * This method reverses an array.
     * 
     * @param array the array to reverse
     * @return a new array with elements in reverse order
     */
    public int[] reverseArray(int[] array) {

        int l = array.length;

        if (l < 2){
            return array;
        }
        
        int[] rArray = new int[l];
        
        for (int i = 0; i < l; i++){
            rArray[l - i - 1] = array[i];
        } 
        
        return rArray;
    }
}