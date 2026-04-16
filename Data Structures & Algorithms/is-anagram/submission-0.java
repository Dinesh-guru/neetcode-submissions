class Solution {
    public boolean isAnagram(String s, String t) {
   if(s.length()!=t.length())return false;
        int [] hash1=new int[26];
        int [] hash2=new int[26];

        for(int i=0;i<s.length();i++){
            hash1[s.charAt(i)-'a']++;
            hash2[t.charAt(i)-'a']++;
        }

        for(int i=0;i<26;i++){
            if(hash1[i]!=hash2[i])return false;
        }
        return true;
    }
}
