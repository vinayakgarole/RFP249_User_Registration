package com.bridgelabz;

import java.util.Scanner;

public class UserRegistrationMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the options: \n1. Validate first name. \n2. Validate last name. \n3. Valid Email ID.");

        switch (sc.nextInt()) {
            case 1:
                UserRegistration.validFirstName();
                break;
            case 2:
                UserRegistration.validLastName();
                break;
            case 3:
                UserRegistration.validEmail();
                break;
        }
    }
}
