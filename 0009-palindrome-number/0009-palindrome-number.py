class Solution:
    def isPalindrome(self, x: int) -> bool:
        st=str(x)
        rev=st[::-1]
        print(st)
        if st==rev:
            return True
        return False