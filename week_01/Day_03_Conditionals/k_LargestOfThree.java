public class k_LargestOfThree {
    public static void main(String[] args) {

        int x = 18;
        int y = 18;
        int z = 15;

        if (x > y) {

            if (x > z) {
                System.out.println("The biggest number is: " + x);
            } else {
                System.out.println("The biggest number is: " + z);
            }

        } else {

            if (y > z) {
                System.out.println("The biggest number is: " + y);
            } else {
                System.out.println("The biggest number is: " + z);
            }
        }
    }
}