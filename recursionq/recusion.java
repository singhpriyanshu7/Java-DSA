//print no 5 to 1
 public class recursion {
// new fn banaya aur void return type hai like return type fnnName(arg1, arg2)
    public static void printNum(int n ){
if(n==0){//this is base case 
return;}
      System.out.println(n);
      printNum(n-1);//yeh recursive call hai 
        
    }
public static void main(String[] args) {
int n =5;

    printNum(n);
}}

// to print no from 1 to n
import java.util.Scanner;
public class recusion{
    public static void printNum(int n ){
        if (n==6){//base case 
            return;
        }
        System.out.println(n);
        printNum(n+1);// recusive call

    }
    public static void main(String[] args) {
      
        int n=2;
      
        printNum(n);
    }
}
//now print sum of first n natural no 
public class recursion{
    public static void printSum(int i , int n ,int sum){
     if(i==n){
        sum+=i;
    System.out.println(sum);
   
     return;}
        sum+=i;
          printSum(i+1,n,sum);
          System.out.println(i);
    }
    public static void main(String[] args) {
        int i=1;
        int n=5;
        int sum=0;
        printSum( i,  n, sum);
    }
}
 //factorial
 
    public class recusion{
        public static int facto(int n ){
            if(n==0||n==1){
return 1;
            }
            int m= n*facto(n-1);
            return m ;

        }
        public static void main(String[] args) {
            int n=5;
          System.out.println( facto(n));
        }
    }

//faboncii series till nth term 
//mtlb a ,b,c toh yaha pe 1=0,b=1 and c =a+b,d=b+c;
//011235...

public class recusion{
    public static void fibo(int a ,int b , int n){
        //base case 
        if(n==0){
        return;}
        //kaam actual me working kya hogi 
        int c =a+b;
        System.out.println(c);
        //recursive call
        fibo(b,c,n-1);


    }
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int n=10;
        System.out.println(a);
        System.out.println(b);
        fibo(a,b,n-2);

    }
}

