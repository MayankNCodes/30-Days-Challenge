class Solution:
    def myPow( x: float, n: int) -> float:
        f = 1
        if n==0:
            return 1
        for i in range(0,abs(n)):
            f = f*x
        if n>0:
            return f
        if n<0:
            return 1/f

x = Solution.myPow(1.3,4)
print(f"{x}")