public class n_DiscountCalc{
    public static void main(String[] args){
        String membership;
        membership = "no";
        double cartBill,discount1,discount2 , totalBill;
        cartBill=10;
        discount1 = cartBill+((cartBill*10)/100);
        discount2 = cartBill+((cartBill*20)/100);
        if(membership.equals("yes")){
            if(cartBill <= 100 && cartBill > 0){
                System.out.println("Total: " + discount1);
            }
            else{
                System.out.println("Total: " + discount2);
            }
        }
        else{
            System.out.println("Total: " + cartBill);
        }
    }
}