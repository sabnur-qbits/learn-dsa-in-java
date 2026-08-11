public class o_LeapYear{
    public static void main(String[] args){
        int year;
        year = 2024;
        if(year%4 == 0){
                if(year%100 == 0){
                    if(year%400 == 0){
                    System.out.println("The year is century and Lipyear");
                }
                else{
                System.out.println("The year is Century year but not leap year");
                }
        }
        else{
            System.out.println("The year is Lipyear.");
        }
       } 
       else{
        System.out.println("The year is not Lipyear");
       }
    }
} 
