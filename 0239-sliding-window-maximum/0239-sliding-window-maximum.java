class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int[] ans=new int[n-k+1];
        Deque<Integer> que=new LinkedList<>();
        //while inserting we are maintaining order. 
        //keeping in decresing order by value. so first one at any point of time will be greater
        //and inserting from last.
        for(int i=0;i<k;i++){
            while(!que.isEmpty() && nums[i]>=nums[que.peekLast()]){
                que.removeLast();
            }
           que .addLast(i);
        }
        for(int i=k;i<n;i++){
            // System.out.println("deque :: "+ que +" beg ");
            ans[i-k]=nums[que.peek()]; //peekfirst it is
            while(!que.isEmpty() && que.peek()<(i-k+1)){
                que.removeFirst();
            } 
            while(!que.isEmpty() && nums[i]>=nums[que.peekLast()]){
                que.removeLast();
            }
           que .addLast(i);
            // System.out.println("deque :: "+ que +" end ");
        }
        ans[n-k]=nums[que.peek()];
        return ans;
    }
}