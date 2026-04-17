class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=0;
        for(int num :piles){
            max=Math.max(num,max);
        }

        int low=1;
        int high=max;
        int ans =0;
        while(low<=high){
            int hrs=0;
            int mid=(low+high)/2;
            for(int i=0;i<piles.length;i++){
                int con=(int)Math.ceil((double)piles[i]/mid);
                 System.out.println(con);
                hrs+=con;
            }
            System.out.println(hrs);
            if(hrs>h){
                low=mid+1;
            }
            else {
                high=mid-1;
                ans=mid;
            }
        }
        return ans;
    }
}
