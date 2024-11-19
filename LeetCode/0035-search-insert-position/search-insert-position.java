class Solution {
    public int searchInsert(int[] nums, int target) {
        
        // Time Complexity = O(log(n))
        int right = nums.length-1;
        int left = 0;

        while(left <= right){
            int mid = (right + (right-left)) / 2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }

        return left;



        /*
            // Time Complexity = O(n)
            for(int i=0; i<nums.length; i++){
                if(nums[i] >= target){
                    return i;
                }
            }
            return nums.length;
        */
    }
}