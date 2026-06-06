public class sortingfirst {
    public static void arrsort(int arr[]){
        for(int i=0;i<arr.length;i++){
System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[]={3,2,4,5,6};
        //bubble sort 
        for(int i=0;i<arr.length-1;i++){
for(int j=0;j<arr.length-i-1;j++){
//swap logic 
if(arr[j]>arr[j+1]){
int temp=arr[j];//original value will not affect
arr[j]=arr[j+1];
arr[j+1]=temp;
}}
//time complexity o(nsq)
        }
        arrsort(arr);
    }
    
}
//now for the optimal soln
 
