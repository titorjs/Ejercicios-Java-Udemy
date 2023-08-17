import java.util.Arrays;

public class StringMagic {

    public boolean areAnagrams(String str1, String str2) {
    
        if(str1 == null || str2 == null){
            return false;
        }
        
        if(str1.length() != str2.length()){
            return false;
        }
        
        char [] s1 = str1.toLowerCase().toCharArray();
        char [] s2 = str2.toLowerCase().toCharArray();
        
        Arrays.sort(s1);
        Arrays.sort(s2);
        
        return Arrays.compare(s1, s2) == 0;
    }
}