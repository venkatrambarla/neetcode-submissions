class Solution {
    public boolean isValid(String s) {
        char[] sChar=s.toCharArray();
        HashMap<Character, Character> paren=new HashMap();
        paren.put(')','(');
        paren.put(']','[');
        paren.put('}','{');

Stack<Character> stack=new Stack<Character>();


for(int i=0;i<sChar.length;i++)
{
    if(sChar[i]=='{' || sChar[i]=='(' || sChar[i]=='[')
    {
        stack.push(sChar[i]);
    }
    else if(sChar[i]=='}' || sChar[i]==')' || sChar[i]==']')
   {
    if(stack.isEmpty()) return false;
    char charK= stack.peek();
    System.out.println("charK"+charK);
    if(paren.get(sChar[i])!=charK) return false;
    stack.pop();

   }
}
if (stack.size()==0 )
    return true ;
else 
    return false;
    }

}
