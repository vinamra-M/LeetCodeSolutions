class Solution(object):
    def zeroFilledSubarray(self, nums):
        count = 0
        ans = 0
        for i in range(len(nums)):
            if nums[i] == 0:
                count+=1
            if nums[i]!= 0 and count != 0:
                ans += (count)*(count+1)/2
                count = 0
        
        if(count != 0):
            ans += (count)*(count+1)/2
        
        return ans
