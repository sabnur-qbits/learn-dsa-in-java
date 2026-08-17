public class o_GuessNumber{
    public static void main(String[] args){
        int target = 42;
        int guess = 39;
        do{
            System.out.println("Wrong guess, trying next...");
            guess++;
        }
        while(guess != target);
     System.out.println("Correct!");   
    }
}