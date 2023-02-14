package com.bridgelabz;

import java.util.Scanner;

public class UserRegistrationMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the options:\n1. Validate first name.\n2. Validate last name.\n3. Valid Email ID.\n4. Validate Mobile Number.\n5. Validate Password Rule1.\n6. Validate Password Rule2.\n7. Validate Password Rule3.\n8. Validate Password Rule4.\n9. Validate Email Samples.");

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
            case 4:
                UserRegistration.validMobileNumber();
                break;
            case 5:
                UserRegistration.validPasswordRule1();
                break;
            case 6:
                UserRegistration.validPasswordRule2();
                break;
            case 7:
                UserRegistration.validPasswordRule3();
                break;
            case 8:
                UserRegistration.validPasswordRule4();
                break;
            case 9:
                UserRegistration.ValidEmailSamples();
                break;
        }
    }
}
