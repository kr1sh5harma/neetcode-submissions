class Solution {
    public int maxArea(int[] heights) {
        int st = 0;
        int end = heights.length-1;
        int res = 0;
        while(st<end){
            int area = Math.min(heights[st], heights[end])*(end-st);
            res = Math.max(area, res);
            if(heights[st]<=heights[end]){
                st++;
            }
            else{
                end--;
            }
        }
        return res;
    }
}
