class Solution:
    def findGCD(self, nums: List[int]) -> int:
        minimum = min(nums)
        maximum = max(nums)
        GCD= gcd(minimum , maximum)
        return GCD
    
    def gcd(x,y):
        while y != 0:
            x , y = x%y , x
        return x
