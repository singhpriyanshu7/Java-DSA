public class revArray{
    public void reverse(int []arr, int n ){
        reversearray(arr,0,n-1);//yaha pe left index 0 or right ko n-1 assign kiya h bs 

    }
    void reversearray(int[]arr,int l,int r){
        if(l>=r){
            return;// jaise hi left = right ya fir left bada ho jayega right se index mtlb rev array hogya
            int temp=arr[i];
            arr[l]=arr[r];
            arr[r]=temp;
            reversearray(arr,l+1,r-1);

        }
    }
}
