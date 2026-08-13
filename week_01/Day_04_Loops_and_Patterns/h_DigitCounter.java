public class h_DigitCounter{
    public static void main(String[] args){
        int num=10485768;
        int c = 0;
        while(num != 0){
            int i = num%10;
            c++;
            num = num/10;
        }
        System.out.println(c);
    } 
}