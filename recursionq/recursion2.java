public class recursion2{
    public static void printString(String str,int i){
        if(i==0){
            System.out.println(str.charAt(i));
            return;
        }
        System.out.println(str.charAt(i));
        //System.out.print(str.charAt(i));
        printString(str, i-1);
    }
    public static void main(String[] args) {
        String str="abcdef";
        printString(str,str.length()-1);
    }
}