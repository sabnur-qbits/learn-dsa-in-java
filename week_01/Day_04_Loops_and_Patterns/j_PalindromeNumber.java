public class j_PalindromeNumber{
    public static void main(String[] args){
        int num = 1211;
        int temp = num;
        int rev = 0;
        while(num != 0){
            int d = num%10;
            rev = rev*10+d;
            num = num/10;
        }
        if(rev == temp){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
