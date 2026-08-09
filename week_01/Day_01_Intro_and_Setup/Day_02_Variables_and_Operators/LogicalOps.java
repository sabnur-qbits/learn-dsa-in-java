public class LogicalOps{
    public static void main(String[] args){
        boolean hasValidUsername = true;
        boolean hasValidPassword = false;
        System.out.println("AND Result: " + (hasValidUsername && hasValidPassword));
        System.out.println("OR Result: " + (hasValidUsername || hasValidPassword));
    }
}