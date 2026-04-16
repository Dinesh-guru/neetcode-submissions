class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int[] lmax=new int[n];
        int[] hmax=new int[n];
        int max1=0;
        int max2=0;
        for(int i=0;i<n;i++){
            max1=Math.max(max1,height[i]);
            lmax[i]=max1;
        }
        for(int i=n-1;i>=0;i--){
            max2=Math.max(max2,height[i]);
            hmax[i]=max2;
        }
        int total=0;
        for(int i=0;i<n;i++){
           total+=Math.min(lmax[i],hmax[i])-height[i];
        }
        return total;
    }
}
