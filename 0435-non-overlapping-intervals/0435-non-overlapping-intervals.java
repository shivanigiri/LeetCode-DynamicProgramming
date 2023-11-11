class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->(a[1]-b[1])); //sort end time
        //System.out.println("arr :: "+ intervals[1][0]+".."+intervals[1][1]);
        int n= intervals.length;
        int count=0;
        int prevend=intervals[0][1];
        int curr=0;
        for(int i=1;i<n;i++){
            curr=intervals[i][0];
            if(prevend>curr ){
                count++;
            }else{            
                prevend=intervals[i][1];
            }
        }
        return count;
    }
}