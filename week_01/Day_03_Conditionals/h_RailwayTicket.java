public class h_RailwayTicket{
    public static void main(String[] args){
        int fare;
        fare = 50;
        double discount =(fare*50)/100;
        double newFare = fare - discount;
        int age;
        age = 89;
        if(age < 5){
            System.out.println("Free cost of Rs 0");
        }
        else if(age >= 60){
            System.out.println("50% discount of Rs:" + newFare);
        }
        else{
            System.out.println("Full fare of Rs: " + fare);
        }
    }
}