class Solution:
    def isHappy(self, n: int) -> bool:
        r = set()
        while True:
            if n in r:
                return False
            if n not in r:
                r.add(n)
            if n == 1:
                return True
            t = 0
            for i in str(n):
                t+= int(i)**2
            n = t
        
