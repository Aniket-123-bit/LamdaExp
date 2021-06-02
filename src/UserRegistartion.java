import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@FunctionalInterface
interface User {
    void emailValidate();

public class UserRegistartion {
    public static void main(String[] args) {
        //Lamda expression
        User user = () -> { Scanner sc = new Scanner(System.in);
            //Regex expression
            String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";

            System.out.println("Enter your email");
            String email = sc.next();

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(email);
            if(matcher.matches()) {
                System.out.println("Given email id is valid");
            } else {
                System.out.println("Given email id is not valid");
            }
        };
        user.emailValidate();
    }


}

}
