public class f_LeapYearMethod{
    public static boolean isLeapYear(int year){
        if(year%4==0){
            if( year%100==0){
                if(year%400==0){
                    System.out.println("The year is lipyear.");
                return true;
                }
                else{
                    System.out.println("The year is not lipyear.");
                    return false;
                }
                
            }
            System.out.println("The year is lipyear.");
            return true;
        }
        else{
            System.out.println("The year is not lipyear.");
        }
        return false;
    }
    public static void main(String args[]){
         int year=2024;
         isLeapYear(year);

    }
}