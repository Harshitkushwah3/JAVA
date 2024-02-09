package ParcticeKG;
import java.util.*;;


//1. Create a program using do-while to find password checker until a valid password is entered.

class password{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the password: ");
        String password=sc.next();
        do{
            System.out.println("Enter the password again: ");
            String password1=sc.next();
            if (password.equals(password1)){
                System.out.println("Password is correct");
                break;
            }
            else{
                System.out.println("Password is incorrect");
            }
        }
        while(true);
    }
}