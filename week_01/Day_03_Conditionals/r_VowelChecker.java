public class r_VowelChecker{
    public static void main(String[] args){
        char letter;
        letter = 't';
        switch(letter){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("The letter is vowel.");
                break;
            default:
                System.out.println("The letter is consonant.");    
        }
    }
}