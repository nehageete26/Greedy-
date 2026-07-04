class Solution {
    public boolean canJump(int[] nums) {
        int maxi = 0, max= 0;
        for(int i=0;i<nums.length;i++){
            if( i> maxi) return false;
            max = i + nums[i];
            maxi = Math.max(maxi,max);
        }
        return true;
    }
}