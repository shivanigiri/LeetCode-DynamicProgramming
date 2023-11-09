class Solution {
    public int minCost(String colors, int[] neededTime) {
        int ans=0,flag=0,max=0;
        for(int i=1;i<neededTime.length;i++){
            char prevCh=colors.charAt(i-1);
            char ch=colors.charAt(i);
            if(ch==prevCh){
                if(flag==0){
                    ans+=neededTime[i-1]+neededTime[i];
                }else{
                    ans+=neededTime[i];
                }
                max=Math.max(max,Math.max(neededTime[i-1],neededTime[i]));
                flag=1;
            }else{
                ans=ans-max;
                max=0;
                flag=0;
            }
            System.out.println("ans "+ ans +"max"+max +" . ");
        }
        if(max!=0){
           ans=ans-max; 
           System.out.println("ans "+ ans +"max"+max +" . ");
        }

        return ans;
    }
}