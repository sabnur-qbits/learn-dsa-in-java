public class j_TrafficLight{
    public static void main(String[] args){
        String lightcolor;
        lightcolor = "Green";
        if(lightcolor.equals("Red")){
            System.out.println("STOP");
        }
        else if(lightcolor.equals( "Yellow")){
            System.out.println("SLOW DOWN");
        }
        else if(lightcolor.equals("Green")){
            System.out.println("GO");
        }
        else{
            System.out.println("INVALID");
        }
    }
}