public class MyString {

    public String str;

    public MyString(String str) {
        this.str = str;
    }
    
    public boolean isHexadecimalChar(char ch) {
        if ((ch >= 97 && ch <= 102) || (ch >= 65 && ch <= 70)){
            return true;
        }
        
        return false;
    }

    public boolean isHexadecimal() {
        if(str == null || str.equals("")){
            return false;
        }
        
        for (char c: str.toCharArray()){
            if(!isHexadecimalChar(c) && !Character.isDigit(c)){
                return false;
            }
        }
        
        return true;
    }
    
}