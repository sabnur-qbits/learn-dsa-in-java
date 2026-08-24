public class f_SimpleInterest{
    public static double printInterest(double principal, double rate, int time){
        double interest=(principal*rate*time)/100;
        System.out.println("Simple Interest: " + interest);
        return interest;
    }
    public static void main(String[] args){
        printInterest(1000.0,5.0,2);
    }
}