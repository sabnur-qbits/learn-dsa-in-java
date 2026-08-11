public class s_MonthDays{
    public static void main(String[] args){
        int month;
        month = 2;
        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
                System.out.println("The number of days is 31");
                break;
            case 2:
                System.out.println("The number of days is 28");
                break;
            case 4:
            case 6:
            case 8:
            case 12:
                System.out.println("The number of days is 30");
                break;    
            default:
               System.out.println("Invalid");
                break;

        }
    }
}