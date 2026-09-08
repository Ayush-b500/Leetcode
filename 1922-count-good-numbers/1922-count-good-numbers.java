class Solution {
    // static final long mod = (Math.pow(10,9) + 7);
    static final long mod = 1_000_000_007;
    public int countGoodNumbers(long n) {
        long odd  = n / 2;
        long even = n / 2 + n % 2;
        return (int)(pow(5 , even) * pow(4 , odd) % mod);
    }
    public long pow(long x, long y){
        if(y == 0){
            return 1;
        }
        long ans = pow(x , y/2);
        ans = (ans * ans) % mod;
        if(y % 2 == 1){
            ans = (ans * x) % mod;
        }
        return ans;
    }
}