class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int numsum=0;
        for(int i=0;i<k;i++){
        numsum+=nums[i];}

      int maxsum=numsum;
        
     for(int i =k;i<nums.length;i++){
        numsum=numsum+nums[i]-nums[i-k];
        if(numsum>maxsum){
            maxsum=numsum;
        }
     }
        
     return (double) maxsum/k;
    }
}