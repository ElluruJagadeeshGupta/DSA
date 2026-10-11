class Solution:
    def evalRPN(self, tokens: list[str]) -> int:
        answer=[]

        for token in tokens:
            if token not in '+-*/':
                answer.append(int(token))
            else:
                b=answer.pop()
                a=answer.pop()
                if token =='+':
                    answer.append(a+b)
                elif token =='-':
                    answer.append(a-b)
                elif token=='*':
                    answer.append(a*b)
                else:
                    cal=int(a/b) if a*b>0 else -(-a//b)
                    answer.append(cal)
        return answer[0]
