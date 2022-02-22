class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch : s.toCharArray())
        {
          map.put(ch, map.getOrDefault(ch, 0) + 1);       
        }
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            int count = map.get(ch);
            if(count==1)
            return i;
        }
        return -1;
    }
}