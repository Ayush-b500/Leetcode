class Solution {
    public int[] sortArray(int[] nums) {
        int n = nums.length;
        if(n <= 1){
            return nums;
        }
        int mid = n / 2;
        int [] left = new int[mid];
        int [] right = new int[n - mid];
        for(int i = 0 ; i < mid ; i++){
            left[i] = nums[i];
        }
        for(int i = mid ; i < n ; i++){
            right[i - mid] = nums[i];
        } 
        sortArray(left);
        sortArray(right);
        merge(nums , left , right);
        return nums;
    }
    public void merge(int[]arr , int []low ,  int []high){
        int i = 0 , j = 0 , k = 0 ;
        while(i < low.length && j < high.length){
            if(low[i] <= high[j]){
                arr[k] = low[i];
                i++;
            }
            else{
                arr[k] = high[j];
                j++;
            }
            k++;
        }
        while(i < low.length){
            arr[k] = low[i];
            i++; 
            k++;
        }
        while(j < high.length){
            arr[k] = high[j];
            j++;
            k++;
        }
    }
}