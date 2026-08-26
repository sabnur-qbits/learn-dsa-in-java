public class a_RecursiveFactorial{
    public static int factorial(int n){
    if(n==1 || n==0){
        return 1;
    }

    int fact=factorial(n-1);
    int ans = n*fact;
    return ans;
   }
   public static void main(String args[]){
    int n =5;
    int ans = factorial(n);
    System.out.println(ans);
   }
}
