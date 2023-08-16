public class ArrayMagic {
    
    /**
     * This method finds and returns the second largest element in the given array.
     * 
     * @param array the array in which to find the second largest element
     * @return the second largest element in the array
     */
     
    public int findSecondLargestElement(int[] array) {
        if (array.length < 2){
            return -1;
        } 
        
        int l1 = Integer.MIN_VALUE;
        int l2 = Integer.MIN_VALUE;
        
        for (int n: array){
            if(n > l1){
                l2 = l1;
                l1 = n;
            } else if (n > l2 && n != l1){
                l2 = n;
            }
        }
        
        return (l2 == Integer.MIN_VALUE ? -1 : l2);
    }
}