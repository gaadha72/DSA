class Solution(object):
    def addDigits(self, num):
        while num>=10:
            a=str(num)
            total=0
            for i in a:
                total+=int(i)
            num = total
        return num

        
        