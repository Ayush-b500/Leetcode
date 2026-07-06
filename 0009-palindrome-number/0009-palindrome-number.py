class Solution:
    def isPalindrome(self, x: int) -> bool:
        if x < 0:
            return False
        m = x
        c = 0
        while x != 0:
            d = x % 10
            c = c * 10 + d
            x //= 10
        
        return c == m
        