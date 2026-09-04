class Solution {
    public boolean isPalindrome(String s) {
        String rev_s = "";
        String x = "";
        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            if(Character.isLetter(c) || Character.isDigit(c)){
                x = x + Character.toLowerCase(c);
            }   
        }
        rev_s = reverse(x);
        boolean valid = x.equals(rev_s);
        return valid;
    }
    public String reverse(String s){
        String rev = "";
        for(int i = s.length()-1 ; i >=0 ; i--){
            rev =  rev + s.charAt(i);
        }
        return rev;
    }
}