public class q_Calculator{
    public static void main(String[] args){
        int a,b;
        a=10;
        b=5;
        char operator;
        operator ='/';
        switch(operator){
            case '+':
                System.out.println("Addition of a and b: " + (a+b));
                break;
            case '-':
                System.out.println("Substraction of a and b: " + (a-b));
                break;
            case '*':
                System.out.println("Multiplication of a and b: " + (a*b));
                break;
            case '/':
                System.out.println("Division of a and b: " + (a/b));
                break;            
            default:
                System.out.println("Invalid");
        }
    }
}