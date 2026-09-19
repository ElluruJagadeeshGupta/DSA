class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map=new HashMap<>();
        String[] arr=s.split(" ");
        if(pattern.length()!=arr.length)
        {
            return false;
        }
        for(int i=0;i<pattern.length();i++)
        {
            char ch=pattern.charAt(i);
            boolean containskey=map.containsKey(ch);
             if (containskey) {
                if (!map.get(ch).equals(arr[i])) {
                    return false;
                }
            }
            else if (map.containsValue(arr[i])) {
                return false;
            }
            else {
                map.put(ch, arr[i]);
            }
        }
        
        return true;

    }
}