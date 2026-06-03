class Solution {
    public double myPow(double x, int n) {
        long N=n;
        if(N==0){
            return 1;
        }
        if(N<0){
            N=-N;
           x=1/x;
        }
        return(N%2==0)?myPow(x*x,(int)(N/2)):myPow(x*x,(int)(N/2))*x;
    }
}
