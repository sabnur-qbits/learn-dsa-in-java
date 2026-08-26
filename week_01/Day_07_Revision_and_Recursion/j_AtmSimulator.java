public class j_AtmSimulator {
    public static void main(String[] args) {

        double balance = 5000.0;
        int choice = 2;

        do {
            System.out.println("--- ATM Menu ---");
            System.out.println("1. Balance  2. Deposit  3. Withdraw  4. Exit");

            switch (choice) {

                case 1:
                    System.out.println("Balance: $" + balance);
                    break;

                case 2:
                    System.out.println("Processing Deposit of $1000...");
                    balance = balance + 1000;
                    System.out.println("New Balance: $" + balance);
                    choice = 4;
                    break;

                case 3:
                    balance = balance - 500;
                    System.out.println("New Balance: $" + balance);
                    break;

                case 4:
                    break;
            }

        } while (choice != 4);

        System.out.println("Exiting... Have a nice day, Sabnur!");
    }
}