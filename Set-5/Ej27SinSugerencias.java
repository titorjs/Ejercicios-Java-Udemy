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
        
        int in = 0, l = 0, aIn = 0, aL = 0;
        
        for(int i = 0; i < sentence.length(); i++){
            if (sentence.charAt(i) == ' '){
                if(aL > l){
                    in = aIn;
                    l = aL;
                }
                
                aIn = i + 1;
                aL = 0;
            } else {
                aL++;
            }
        }
        
        if(aL > l){
            in = aIn;
            l = aL;
        }
        
        return sentence.substring(in, in + l);
        
    }
}