class Solution {
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE, sum=0, n=nums.length;
        // int[] psum=new int[n+1];
        // psum[0]=0;
        for(int i=0;i<n;i++){
            sum=sum+nums[i];
            max=Math.max(max,sum);   
            if(sum<0){
                sum=0;
            }    
            //psum[i+1]=nums[i]+psum[i];
        }
        // for(int i=0;i<n+1;i++){
        //     for(int j=0;j<i;j++){
        //         sum=psum[i]-psum[j];
        //         max=Math.max(max,sum);
        //     }
        // }
        return max;
    }
}