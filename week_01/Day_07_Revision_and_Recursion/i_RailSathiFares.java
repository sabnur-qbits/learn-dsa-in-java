public class i_RailSathiFares{
    /*public static double calculateFare(double distance){
        double fare = distance*0.1;
        return fare;
        
    }
    public static double calculateFare(double distance, boolean issenior){
        if(issenior==true){
            double fare=(distance*0.1);
            double discount=fare/2;
            return discount;
        }
        else{
            if(issenior==false);
            return distance*0.1;
        }
    }*/
   public static double calculateFare(double distance) {
    return distance * 0.1;
}

public static double calculateFare(double distance, boolean isSenior) {
    double fare = calculateFare(distance);  // calling the other method

    if (isSenior) {
        return fare / 2;
    }

    return fare;
}
    public static void main(String[] args){
        double ans=calculateFare(100.0,false);
        System.out.println(ans);
    }
}