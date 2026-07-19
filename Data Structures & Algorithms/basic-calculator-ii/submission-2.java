class Solution {
    public int calculate(String s) {
        s=s.replace(" ", "");
        char[] sArray=s.toCharArray();
        int n=sArray.length;
        Stack<Integer> sStack=new Stack<>();
        int currentNumber=0;
       char op='+';
        for(int i=0;i<n;i++)
        {
            char ch=sArray[i];
            if(Character.isDigit(ch))
            {
                currentNumber = currentNumber * 10 + (ch - '0');
            }
             if(!Character.isDigit(ch)|| i==n-1)
            {
                if(op=='+')
                {
                    sStack.push(currentNumber);
                }
                if(op=='-')
                {
                    sStack.push(-currentNumber);
                }
                if(op=='*')
                {
                    sStack.push(sStack.pop()*currentNumber);
                }
                if(op=='/')
                {
                    sStack.push(sStack.pop()/currentNumber);
                }
                
               op=ch;
               currentNumber=0;

            }
        }
        int res =0;
        while(!sStack.isEmpty())
        {
            res+=sStack.pop();
        }
        return res;


    }
}