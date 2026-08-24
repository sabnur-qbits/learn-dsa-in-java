public class c_MenuDisplay{
    public static void showMenu(String menu){
        System.out.println(menu);
    }
    public static void main(String[] args){
        showMenu("1. Play\n" + "2. Load\n" + "3. Settings\n" + "4. Exit");
    }
}