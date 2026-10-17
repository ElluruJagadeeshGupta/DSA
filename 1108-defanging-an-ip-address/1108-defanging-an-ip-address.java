class Solution {
    public String defangIPaddr(String address) {
        StringBuilder a=new StringBuilder();
        for(int i=0;i<address.length();i++)
       {
        if(address.charAt(i)=='.')
        {
            a.append("[.]");
        }
        else
        {
            a.append(address.charAt(i));
        }
       }
       return a.toString();
    }
}