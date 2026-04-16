class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)return 0;
        TreeSet<Integer> set=new TreeSet<>();
        for(int num :  nums){
            set.add(num);
        }

        int last=set.pollFirst();
        int max=1;
        int cnt=1;

        while(!set.isEmpty()){
            int num=set.pollFirst();
            if(num==last+1){
                cnt++;
            }
            else{
                cnt=1;
            }
            max=Math.max(cnt,max);
            last=num;
        }

        return max;
    }
}
