class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int count = 0 , maxi = 0;
        for(int i = 0 ; i < n ; i++){
            if(nums[i] != 1){
                count = 0;
            }else{
                count++;
                if(count > maxi){
                    maxi = count;
                }
            }
        }
        return maxi;
    }
}