class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        int rem,div=0, temp=0;
        for(int i=n-1;i>=0;i--)
        {
        
           

               // digits[i]=digits[i]+div;
            digits[i]=digits[i]+1;
            System.out.println("digits[i]"+digits[i]);
            if(digits[i]<=9)
            {
                div=0;
                rem=0;
                break;
                
            }
            else
            {
               // if(digits[i]<10){
               // int  temp=digits[i]+1;
                //}
                 rem=digits[i]%10;
                 div=digits[i]/10;
                digits[i]=rem;
                
                System.out.println("digits[else]"+digits[i]);
            }
          
            }
        if(div>0)
         { 
            int[] newDigits=new int[n+1];
             newDigits[0]=1;
          return newDigits;
         }

         return digits;
        
    }
}
