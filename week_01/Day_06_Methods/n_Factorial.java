public class n_Factorial{
    public static long getFactorial(int n){
        long factorial=1;
        for(int i=n;i>=1;i--){
            factorial=factorial*i;
            
        }
        return factorial;
    }
    public static void main(String[] args){
        long factorial=getFactorial(5);
        System.out.println(factorial);
    }
}