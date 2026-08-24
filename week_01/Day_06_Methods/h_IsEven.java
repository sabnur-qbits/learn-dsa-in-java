public class h_IsEven{
    public static boolean checkEven(int number){
        if(number%2==0){
            System.out.println("The number is even.");
        }
        else{
            System.out.println("The number is odd.");
        }
        return true;
    }
    public static void main(String[] args){
        checkEven(45);
    }
}