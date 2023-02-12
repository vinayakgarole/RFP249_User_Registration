package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public static final Scanner sc = new Scanner(System.in);

    public static void validFirstName() {
        System.out.println("Enter the First Name: ");
        String name = sc.next();
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        boolean result = matcher.matches();

        if (result) {
            System.out.println("Enter name is valid");
        } else {
            System.out.println("Enter name is invalid");
        }
    }

    public static void validLastName() {
        System.out.println("Enter the Last Name: ");
        String name = sc.next();
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        boolean result = matcher.matches();

        if (result) {
            System.out.println("Enter name is valid");
        } else {
            System.out.println("Enter name is invalid");
        }
    }
}
