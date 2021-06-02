import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@FunctionalInterface
interface User {
    void mobileValidate();
}
public class UserRegistartion {
    public static void main(String[] args) {

        User user = () -> {
            Scanner sc = new Scanner(System.in);

            String regex = "(0/91)?[7-9][0-9]{9}";

            System.out.println("Enter your mobile number");
            String email = sc.next();

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(email);
            if(matcher.matches()) {
                System.out.println("Given mobile number is valid");
            } else {
                System.out.println("Given mobile number is not valid");
            }
        };
        user.mobileValidate();
    }

}
