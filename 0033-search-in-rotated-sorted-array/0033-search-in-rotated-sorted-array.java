class Solution {
    public int search(int[] nums, int target) {
        int l=0,r=nums.length-1,mid=0;
        while(l<=r){
             mid=l+(r-l)/2;
            if(target==nums[mid]){
                return mid;
            }
            if(target<nums[0]){ // part2
                if(nums[mid]>=nums[0]){
                    l=mid+1;
                }else{
                    if(target>nums[mid]){
                        l=mid+1;
                    }else{
                        r=mid-1;
                    }
                }
            }else{
                if(nums[mid]<nums[0]){
                    r=mid-1;
                }else{
                    if(target>nums[mid]){
                        l=mid+1;
                    }else{
                        r=mid-1;
                    }
                }
            }
        }
        return -1;
    }
}