/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emailaplication;

import java.util.Scanner;

/**
 *
 * @author ahsan
 */
public class User {

    private String firstName, lastName, password, alternateEmail, department, email;
    private int mailBoxCapacity;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Hello " + this.firstName + ". Welcome to our Company");
        department = setDepartment();

        email = this.firstName.toLowerCase() + "." + this.lastName.toLowerCase() + "@" + this.department.toLowerCase() + ".company.com";

        System.err.println("Your Email is: ");
        System.out.println("Email: " + email);
        System.out.println("Password: " + this.genaratePassword(12));
    }

    private String setDepartment() {
        System.out.println("Please Set Your Department: \n1 for sales\n2 for marketing \n3 for Development");
        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextLine()) {
            case "1":
                System.out.println("Your Department is Sales");
                return "Sales";
            case "2":
                System.out.println("Your Department is Marketing");
                return "Marketing";
            case "3":
                System.out.println("Your Department is Development");
                return "Development";
            default:
                System.err.println("Please Enter Your Department Code");
                return "";
        }

    }

    private String genaratePassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&(){}[]?";
        StringBuilder password = new StringBuilder(length);

        for (int i = 0; i <= length; i++) {
            password.append(passwordSet.charAt((int) Math.floor(Math.random() * passwordSet.length())));
        }

        return password.toString();
    }

}
