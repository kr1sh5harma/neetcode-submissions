class Solution {
    public int search(int[] nums, int target){
        int pivot = pivot(nums);
        if(pivot==-1) return binarySearch(nums, target, 0, nums.length-1);
        if(target==nums[pivot]) return pivot;
        if(target>=nums[0]) return binarySearch(nums, target, 0, pivot-1);
        return binarySearch(nums, target, pivot+1, nums.length-1);
    }

    public int binarySearch(int[] nums, int target, int st, int end){
        while(st<=end){
            int mid = st+(end-st)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]>target) end = mid-1;
            else st = mid+1;
        }
        return -1;
    }

    public int pivot(int[] nums){
        int st = 0;
        int end = nums.length-1;
        while(st<end){
            int mid = st+(end-st)/2;
            if(mid<end && nums[mid]>nums[mid+1]){
                return mid;
            }
            if(mid>st && nums[mid]<nums[mid-1]){
                return mid-1;
            }
            if(nums[mid]<=nums[st]){
                end = mid-1;
            }
            else{
                st = mid+1;
            }
        }
        return -1;
    }
}
