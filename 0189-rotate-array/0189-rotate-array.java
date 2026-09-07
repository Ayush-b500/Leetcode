class Solution {
    public void rotate(int[] nums, int k) {
        // int n = nums.length;
        // if(k < 0){
        //     System.out.println("Invalid steps");
        // }else{
        //     for(int i = 1 ; i <= k ; i++){
        //         for(int j = n-1 ; j >= 1 ; j--){
        //             int temp = nums[j];
        //             nums[j] = nums[j-1];
        //             nums[j-1] = temp;
        //         }
        //     }
        // }
        int n = nums.length;
        k = k % n;
        reverse(nums , 0 , n-1);
        reverse(nums , 0 , k-1);
        reverse(nums , k , n-1);

    }
    public void reverse(int []nums , int left , int right){
        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}