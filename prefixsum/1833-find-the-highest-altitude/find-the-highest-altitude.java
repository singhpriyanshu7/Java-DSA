class Solution {
    public int largestAltitude(int[] gain) {
        int currentaltitude=0;
        int heighestaltitude=0;
        for(int num:gain){
            currentaltitude+=num;
            if(currentaltitude>heighestaltitude){
                heighestaltitude=currentaltitude;
            }

        }
      return heighestaltitude;
    }
}