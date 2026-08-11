public class g_TempAlert{
    public static void main(String[] args){
        int tempInCelsius;
        tempInCelsius = 19;
        if(tempInCelsius < 0){
            System.out.println("Freezing!");
        }
        else if(tempInCelsius >= 0 && tempInCelsius <=15){
            System.out.println("Cold");
        }
        else if(tempInCelsius >= 16 && tempInCelsius <=30){
            System.out.println("Warm");
        }
        else{
            System.out.println("Hot!!!");
        }
    }
}