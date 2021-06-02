import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@FunctionalInterface
interface User {
    void passwordValidate();
}

public class UserRegistartion {
    public static void main(String[] args) {

        User user = () -> {
            Scanner sc = new Scanner(System.in);

            String regex = "^(?=.*[0-9])"
                    + "(?=.*[a-z])(?=.*[A-Z])"
                    + "(?=.*[@#$%^&+=])"
                    + "(?=\\S+$).{8,20}$";
            ;
            /*^ represents starting character of the string.
            (?=.*[0-9]) represents a digit must occur at least once.
            (?=.*[a-z]) represents a lower case alphabet must occur at least once.
                (?=.*[A-Z]) represents an upper case alphabet that must occur at least once.
                (?=.*[@#$%^&-+=()] represents a special character that must occur at least once.
                (?=\\S+$) white spaces don’t allowed in the entire string.
             .{8, 20} represents at least 8 characters and at most 20 characters.
                    $ represents the end of the string.*/

            System.out.println("Enter your password number");
            String password = sc.next();

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(password);
            if(matcher.matches()) {
                System.out.println("Given password is valid");
            } else {
                System.out.println("Given password is not valid");
            }
        };
        user.passwordValidate();
    }


}
