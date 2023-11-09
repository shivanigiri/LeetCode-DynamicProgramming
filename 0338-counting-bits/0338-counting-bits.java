class Solution {
    public int[] countBits(int n) {
        int[] arr=new int[n+1];
        for(int i=1, pow=1;i<=n;i++){
           if(i==pow*2) pow=pow*2;
            arr[i]=1+arr[i-pow];
        }
        return arr;
    }
}