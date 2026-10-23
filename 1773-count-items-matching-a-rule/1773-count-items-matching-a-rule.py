class Solution:
    def countMatches(self, items: list[list[str]], ruleKey: str, ruleValue: str) -> int:
        count=0
        for i,c,n in items:
            if ruleKey=='type' and ruleValue==i or ruleKey=='color' and ruleValue==c or ruleKey=='name' and ruleValue==n:
                count+=1
                
        return count