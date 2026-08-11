public class i_BMICategory{
    public static void main(String[] args){
        double bmi;
        bmi = -9;
        if(bmi <18.5 && bmi>0){
            System.out.println("Underweight");
        }
        else if(bmi >= 18.5 && bmi <= 24.9){
            System.out.println("Normalweight");
        }
        else if(bmi >= 25 && bmi <=29.9){
            System.out.println("Overweight");
        }
        else if(bmi<0){
            System.out.println("Invalid");
        }
        else{
            System.out.println("Obese");
        }
    }
}