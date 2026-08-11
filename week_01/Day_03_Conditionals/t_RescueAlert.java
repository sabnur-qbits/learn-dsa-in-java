public class t_RescueAlert {
    public static void main(String[] args) {

        int alertLevel = 3;

        switch (alertLevel) {

            case 1:
                System.out.println("Low priority - Log location.");
                break;

            case 2:
                System.out.println("Medium priority - Dispatch volunteer.");
                break;

            case 3:
                System.out.println("High priority - Send medical team.");
                break;

            case 4:
                System.out.println("Critical - Alert local veterinary hospital.");
                break;

            default:
                System.out.println("Invalid alert level.");
        }
    }
}