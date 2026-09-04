class Solution {
    public String reverseWords(String s) {
        String rev_str = reverse(s);
        String ans = "";
        for(int i = 0 ; i < rev_str.length() ; i++){
            String word = "";
            while(i < rev_str.length() && rev_str.charAt(i) != ' '){
                word = word + rev_str.charAt(i);
                i++;
            }
            word = reverse(word);
            if(!word.isEmpty()){
                if(ans.isEmpty()){
                    ans = word;
                }else{
                    ans = ans + " " + word;
                }
            }
        }
        return ans;
    }
    public String reverse(String s){
        String rev = "";
        for(int i = s.length() - 1 ; i >= 0 ; i--){
            rev =  rev + s.charAt(i);
        }
        return rev;
    }
}