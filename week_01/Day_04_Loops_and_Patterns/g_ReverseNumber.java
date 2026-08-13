public class g_ReverseNumber{
    public static void main(String[] args){
        int num;
        num = 9876;
        int rev;
        rev = 0;
        while(num != 0){
            int d = num%10;
            rev = rev*10+d;
            num = num/10;
        //System.out.println(rev);
        }
        System.out.println(rev);
    }
}