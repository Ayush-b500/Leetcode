class Solution:
    def gcdOfOddEvenSums(self, n: int) -> int:
        sumEven = 0 
        sumOdd = 0
        for i in range(1 , n+1):
            sumEven += 2*i
            sumOdd += 2*i-1
        
        return gcd(sumOdd , sumEven)

    def gcd(x , y):
        while y != 0:
            x , y = y , x%y
        return x
