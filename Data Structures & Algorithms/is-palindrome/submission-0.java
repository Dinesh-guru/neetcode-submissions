class Solution {
    public boolean isPalindrome(String s) {
     
        String r = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int i=0;
        int j=r.length()-1;
        System.out.println(r);
        while(i<j){

          
            if(r.charAt(i)!=r.charAt(j)){
                return false;
            }
            i++;

            j--;
        }
        return true;
    }

}
