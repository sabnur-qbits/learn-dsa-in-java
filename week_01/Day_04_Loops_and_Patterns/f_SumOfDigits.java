public class f_SumOfDigits{
    public static void main(String[] args){
        int num = 456;
        int sum = 0;
        while(num != 0){
            int d = num%10;
            num = num/10;
            sum = sum+d; 
        }
         System.out.println(sum);
    }
}