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

    public static void validEmail() {
        System.out.println("Enter the Email ID: ");
        String name = sc.next();
        String regex = "^[a-zA-Z0-9_1-1.]+[@][a-z]+[1.][a-z]{2,3}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        boolean result = matcher.matches();

        if (result) {
            System.out.println("Enter Email ID is valid");
        } else {
            System.out.println("Enter Email ID is invalid");
        }
    }

    public static void validMobileNumber() {
        System.out.println("Enter the Mobile Number: ");
        String name = sc.next();
        String regex = "^[\\d]{2}\\s[\\d]{10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        boolean result = matcher.matches();

        if (result) {
            System.out.println("Enter Mobile Number is valid");
        } else {
            System.out.println("Enter Mobile Number is invalid");
        }
    }

    public static void validPasswordRule1() {
        System.out.println("Enter the Password Rule 1: ");
        String name = sc.next();
        String regex = "^[A-Za-z0-9@._-]{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        boolean result = matcher.matches();

        if (result) {
            System.out.println("Enter Password 1 is valid");
        } else {
            System.out.println("Password must have 8 character");
        }
    }

    public static void validPasswordRule2() {
        System.out.println("Enter the Password Rule 2: ");
        String name = sc.next();
        String regex = "^[A-Z]{1}[A-Za-z0-9@._-]{7,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        boolean result = matcher.matches();

        if (result) {
            System.out.println("Enter Password 2 is valid");
        } else {
            System.out.println("Password must have atleast one uppercase letter");
        }
    }

    public static void validPasswordRule3() {
        System.out.println("Enter the Password Rule 3: ");
        String name = sc.next();
        String regex = "^(?=.*[A-z])(?=.*[0-9])([a-zA-Z0-9@._-]).{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        boolean result = matcher.matches();

        if (result) {
            System.out.println("Enter Password 3 is valid");
        } else {
            System.out.println("Password must have atleast one numeric number");
        }
    }
}
