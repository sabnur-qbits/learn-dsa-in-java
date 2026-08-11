public class m_SecureLogin{
    public static void main(String[] args){
        String storedUsername , storedPassword , inputUsername , inputPassword;
        storedUsername = "sabnur.alok69";
        storedPassword = "salok";
        inputUsername = "sabnur.alok69";
        inputPassword = "salok";
        if(inputUsername.equals(storedUsername)){
            if(inputPassword.equals(storedPassword)){
                System.out.println("Login Successful");
            }
            else{
               System.out.println("Login failed");
            }
        }
        else{
            System.out.println("Invalid Username");
        }
        


    }
}