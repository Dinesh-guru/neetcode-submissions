class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        int[] hash = new int[strs.length];
        for (int i = 0; i < strs.length; i++) {
            List<String> arr = new ArrayList<>();

            if (hash[i] == 0) {
                for (int j = i + 1; j < strs.length; j++) {
                    if (isAnagram(strs[i], strs[j])) {
                        arr.add(strs[j]);
                        hash[j] = 1;
                    }
                }
                arr.add(strs[i]);
                hash[i] = 1;
                list.add(arr);
            }
        }
        return list;
    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        int[] hash1 = new int[26];
        int[] hash2 = new int[26];

        for (int i = 0; i < s.length(); i++) {
            hash1[s.charAt(i) - 'a']++;
            hash2[t.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (hash1[i] != hash2[i])
                return false;
        }
        return true;
    }
}