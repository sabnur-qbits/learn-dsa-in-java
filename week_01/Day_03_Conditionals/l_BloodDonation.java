public class l_BloodDonation{
    public static void main(String[] args){
        int age;
        age = 17;
        double weight;
        weight = 49;
        if(age >=18){
            if(weight>=50){
                System.out.println("Eligible for blood donating.");
            }             
          else{
              System.out.println("Not Eligible");
            }
        }    
        else{
            System.out.println("Underage");
        }
    }
}  
