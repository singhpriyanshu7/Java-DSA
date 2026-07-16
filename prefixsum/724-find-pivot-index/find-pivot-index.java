class Solution {
    public int pivotIndex(int[] nums) {
        int totalsum=0;
        //find total sum step1
        for(int num:nums){
            totalsum+=num;
        }
//now find the rightsum;
       int leftsum=0;
       for(int i=0;i<nums.length;i++){
        int rightsum=totalsum-leftsum-nums[i];
        //check for pivot element
        if (leftsum==rightsum){
            return i;


        }
        leftsum+=nums[i];
       }
       return -1;
    }
}