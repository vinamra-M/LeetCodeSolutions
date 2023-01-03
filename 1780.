class Solution:    
    def ternary(self, n: int):
        if n == 0:
            return '0'
        nums = []
        while n:
            n, r = divmod(n, 3)
            nums.append(str(r))
        return ''.join(reversed(nums))
                       
    def checkPowersOfThree(self, n: int) -> bool:
        a = self.ternary(n)
        a = str(a)
        if '2' in a:
            return False
        else:
            return True
    
        
