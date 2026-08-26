public class b_RecursiveCountdown{
    public static void countDown(int n){
        if(n==0){
            System.out.println("Blast off!!");
            return;
        }
        System.out.println(n);
        countDown(n-1);

    }
    public static void main(String[] args){
        int n=5;
        countDown(n);
    }
}