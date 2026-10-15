class Solution:
    def longestPalindrome(self, s: str) -> str:
        def expand(left,right):
            while left>=0 and right<len(s) and s[left]==s[right]:
                left-=1
                right+=1
            return s[left+1:right]
        remo=""
        for i in range(len(s)):
            po1=expand(i,i)
            if len(po1)>len(remo):
                remo=po1

            po2=expand(i,i+1)
            if len(po2)>len(remo):
                remo=po2
        return remo
        