class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        map={}
        n=len(nums)
        for i in range(0,n):
            c=target-nums[i]
            if c in map:
                return [map[c],i]
            map[nums[i]]=i
        return []