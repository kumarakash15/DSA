class Solution {
    public int maxArea(int[] height) {
        int lp=0,rp=height.length-1,maxwater=0;
        while(lp<rp){
            int width=rp-lp;
            int barheight=Math.min(height[lp],height[rp]);
            int currwater=width*barheight;
            maxwater=Math.max(maxwater,currwater);
            if(height[lp]<height[rp]){
                lp++;
            }
            else{
                rp--;
            }
        }
        return maxwater;
    }
}