class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> uniqueEmails=new HashSet<>();
        for(int i=0;i<emails.length;i++)
        {
            String email=emails[i];
            StringBuffer sb=new StringBuffer();
            String localName=email.substring(0, email.indexOf('@'));
            String domainName=email.substring(email.indexOf('@')+1, email.length());
            String locaName2=localName.replace(".","");
            System.out.println(locaName2);
            String localName1=locaName2;
            if(locaName2.indexOf('+')>0)
            {
             localName1=locaName2.replace(locaName2.substring(locaName2.indexOf('+'), locaName2.length()),"");
            }
            sb=sb.append(localName1+domainName);
            System.out.println(sb.toString());
            uniqueEmails.add(sb.toString());
        }
        return uniqueEmails.size();
        
    }

}