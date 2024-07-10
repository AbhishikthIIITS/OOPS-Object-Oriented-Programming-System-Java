package oop_lab.lab3;

import java.util.*;

class Account {
    String acc_no;
    String acc_name;
    String password;
    long balance;
}

public class BankApplication_S20210010044 {

    public static void CreateAccount(Account acc) {
        Scanner i = new Scanner(System.in);
        System.out.println("Enter account details:-\n");
        System.out.println("Enter account number:-\n");
        
        acc.acc_no = i.nextLine();
        System.out.println("Enter account name:-\n");
        acc.acc_name = i.nextLine();
        System.out.println("Enter account details:-\n");
        acc.password = i.nextLine();
        System.out.println("Enter account balance:-\n");
        acc.balance = i.nextInt();
        i.close();
    }

    public static void AccountBalanceChecking(Account acc[]) {
        if (AccountLogin(acc, n) == true) {
            System.out.println("Available balance in your account is " + acc[key].balance);
        }
    }

    public static void Credit_and_Debit(Account acc[]) {
        if (AccountLogin(acc, n) == true) {
            int m;
            Scanner i = new Scanner(System.in);
            System.out.println("1. Credit Operation");
            System.out.println("2. Debit Operation");
            System.out.println("3. Exit");
            while (true) {
                m = i.nextInt();
                switch (m) {
                    case 1: {
                        int bal;
                        System.out.println("Enter money you want to credit");
                        bal = i.nextInt();
                        acc[key].balance += bal;
                        AccountBalanceChecking(acc);
                        break;
                    }
                    case 2: {
                        int bal1;
                        System.out.println("Enter money you want to debit");
                        bal1 = i.nextInt();
                        acc[key].balance -= bal1;
                        AccountBalanceChecking(acc);
                        break;
                    }
                }
            }
        }
    }

    public static boolean AccountLogin(Account acc[], int n) {
        String a_no;
        String a_password;
        Scanner i = new Scanner(System.in);
        System.out.println("Enter account number");
        a_no = i.nextLine();
        System.out.println("Enter password");
        a_password = i.nextLine();
        for (int p = 0; p < n; p++) {
            if (a_no.compareTo(acc[p].acc_no) == 0) {
                key = p;
            }
        }
        if (a_password.compareTo(acc[key].password) == 0) {
            System.out.println("Account login successfull");
            return true;
        } else
            System.out.println("Wrong Password");
        return false;
    }

    static int n;
    static int key = 0;

    public static void main(String[] args) {
        int choice;
        System.out.println("Enter your choice");
        System.out.println("1. Account creation");
        System.out.println("2. Account balance checking");
        System.out.println("3. Credit and Debit operations");
        System.out.println("4. Account login");
        System.out.println("5. Exit");
        Scanner i = new Scanner(System.in);
        Account acc[] = new Account[10];

        while (true) {
            choice = i.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Enter number of accounts");
                    n = i.nextInt();

                    for (int j = 0; j < n; j++) {
                        acc[j] = new Account();
                        CreateAccount(acc[j]);
                    }
                    break;
                }
                case 2: {

                    AccountBalanceChecking(acc);
                    break;
                }
                case 3: {

                    Credit_and_Debit(acc);
                    break;
                }
                case 4: {

                    AccountLogin(acc, n);
                    break;
                }
                case 5: {
                    System.exit(1);
                }
            }
        }
    }
}
