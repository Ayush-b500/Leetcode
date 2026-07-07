class Solution:
    def countGoodNumbers(self, n: int) -> int:
        mod = 10**9 + 7
        def power(x,y):
            if y == 0:
                return 1
            
            ans = power(x , y//2)
            ans = (ans * ans) % mod

            if y % 2 == 1:
                ans = (ans * x) % mod 
            return ans

        even = n // 2 + n % 2
        odd = n // 2
        return (power(5 , even) * power(4 , odd)) % mod
