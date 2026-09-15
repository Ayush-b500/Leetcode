class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }else{
            int []freq1 = new int[26];
            for(int i = 0 ; i < s.length() ; i++){
                char ch1 = s.charAt(i);
                freq1[ch1 - 'a']++;
            }
            int []freq2 = new int[26];
            for(int j = 0 ; j < t.length() ; j++){
                char ch2 = t.charAt(j);
                freq2[ch2 - 'a']++;
            }
            for(int i = 0 ; i < 26 ; i++){
            if(freq1[i] != freq2[i]){
                return false;
            }
            }
        return true;
        }
    }
}