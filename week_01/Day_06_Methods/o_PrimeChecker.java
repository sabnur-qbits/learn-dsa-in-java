public class o_PrimeChecker{
    public static boolean isPrime(int num){
        int c=0;
        for(int i=1;i<=num;i++){
            if(num%1==0){
                c++;
            }
            if (c==2){
                return true;
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        boolean prime = isPrime(29);
        System.out.println(prime);
    }
}