class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int pfsum=0,maxValue=0,index=0;
        for(int i=gas.length-1;i>=0;i--){
            pfsum += gas[i]-cost[i];
            if(maxValue<pfsum){
                maxValue=pfsum;
                index=i;
            }
        }
        if(pfsum<0)
            return -1;
        return index;
    }
}