class Solution {

    public String encode(List<String> strs) {
        String s="";

        for(String str : strs){
            s+=str.length()+"#"+str;
        }
        System.out.println(s);
        return s;
    }

    public List<String> decode(String s) {
        List<String> decode=new ArrayList<>();
        int i=0;
          while (i < s.length()) {
            // Step 1: read number
            int num = 0;
            while (s.charAt(i) != '#') {
                num = num * 10 + (s.charAt(i) - '0');
                i++;
            }

            i++; // skip '#'

            // Step 2: extract substring
            String word = s.substring(i, i + num);
            decode.add(word);

            i = i + num; // move pointer
        }
        return decode;
    }
}
