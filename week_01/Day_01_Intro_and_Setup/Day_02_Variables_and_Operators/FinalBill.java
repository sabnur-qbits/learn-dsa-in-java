public class FinalBill{
    public static void main(String[] args){
        double basePrice = 250.0;
        double tax = (basePrice * 18)/100;
        double Final = basePrice + tax;
        int i;
        i = (int)Final;
        System.out.println("Original Price: " + basePrice);
        System.out.println("Price with tax: " + Final);
        System.out.println("Final Bill: " + i);
    }
}