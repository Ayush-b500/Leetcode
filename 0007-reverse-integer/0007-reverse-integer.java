class Solution {
    public int reverse(int x) {
        int sign = 1;
        if(x > 0){
            sign = 1;
        }else{
            sign = -1;
        }
        long n = Math.abs(x);
        long digit = 0 , rev = 0;
        while(n > 0){
            digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }
        rev *= sign;
       if (rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE) {
            return 0;
        }

        return (int) rev;
    }
}