public class k_Multiply{
    public static int multiply(int a,int b){
        System.out.println(a*b);
        return a*b;
    }
    public static int multiply(int a,int b,int c){
        System.out.println(a*b*c);
        return a*b*c;
    }
    public static double multiply(double a,double b){
        System.out.println(a*b);
        return a*b;
    }
    public static void main(String[] args){
        multiply(4,5);
        multiply(7,8,9);
        multiply(7.6,9.8);
    }   
}