public class MyChar {

    // Method to determine if a character is a vowel
    public boolean isVowel(char ch) {
    
        // Use a switch statement to check for each vowel, both lowercase and uppercase
        ch = Character.toUpperCase(ch);
        switch (ch) {
        
            // TODO: Complete the switch statement
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U': return true;
        }

        return false;
    }
}