public class recursion1 {

    public static void arrRev(int[] arr,int i ){
        if(i==0){
            System.out.println(arr[i]);
            return;
        }
        System.out.println(arr[i]);
        arrRev(arr, i-1);

    }
public static void main(String[] args) {
    int[]arr={1,2,3,4,5,6,7};
arrRev(arr,arr.length-1);

}
}
