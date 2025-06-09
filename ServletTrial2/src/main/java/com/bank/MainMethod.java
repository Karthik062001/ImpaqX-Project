package com.bank;

import java.sql.SQLException;
import java.util.Scanner;

public class MainMethod {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankApp bankApp = new BankApp();

        System.out.println("List of all Accounts:");
        try {
            System.out.println(bankApp.listAccount());
        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println("Enter the Account No you want to view:");
        int acNo = sc.nextInt();

        try {
            System.out.println(bankApp.particularData(acNo));
        } catch (Exception e) {
            e.printStackTrace();
        }

        sc.close();
    }
}
