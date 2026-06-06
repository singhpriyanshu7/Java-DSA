class noduplicate {
    public static int removeDuplicates(int[] nums) {
      if(nums.length == 0) return 0;
      int res = 1;
      for(int i = 1; i < nums.length; i++){
        if(nums[i] != nums[i - 1]){
          nums[res] = nums[i];
          res++;
        }
      }
      return res;
    }

public static void main(String args[]){
    int nums[]={1,2,3,3,4,4,5};

int ans=removeDuplicates(nums);
for(int i =0;i<ans;i++){
System.out.println(nums[i]+" ");}
}}