public class StringMagic {

    /**
     * This method finds the longest word in a given sentence.
     *
     * @param sentence The sentence to find the longest word in.
     * @return The longest word in the sentence. If sentence is empty, return an empty string.
     */
    public String findLongestWord(String sentence) {

        // TODO: Write your code here
        
        if (sentence == null || sentence.isEmpty()){
            return "";
        }
        
        int l = 0;
        String word = "";
        
        for (String wordI: sentence.split(" ")){
            if (wordI.length() > l){
                l = wordI.length();
                word = wordI;
            }
        }
        
        return word;
        
    }
}