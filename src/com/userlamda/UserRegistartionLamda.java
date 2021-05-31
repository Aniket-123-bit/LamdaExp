package com.userlamda;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@FunctionalInterface
// operation is implemented using lambda expressions
interface FirstName {
    void firstNameValidate();
}

public class UserRegistartionLamda {
    public static void main(String[] args) {
        // This expression implements 'Firstname' interface
        FirstName fName = () -> {
            Scanner sc = new Scanner(System.in);

            String regex = "^[A-Z]{1}[a-z]{3,20}$";

            System.out.println("Enter your name");
            String name = sc.next();

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(name);
            if(matcher.matches()) {
                System.out.println(" Name is valid");
            } else {
                System.out.println(" Name  is not valid");
            }
        };
        fName.firstNameValidate();
    }



}
