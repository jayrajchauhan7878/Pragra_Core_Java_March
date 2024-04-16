package Assignment4;

import java.util.Scanner;

public class BankAccount {


/*
    Create a BankAccount class with properties accountNumber, accountHolderName, balance, accountType.
    Write a constructor to initialize these properties when creating a BankAccount object.
    Include methods to deposit and withdraw money, and a method to display the account details.
*/

    int accountNumber ;
    String accountHolderName;
    int balance ;
    String accountType;

    Scanner scanner = new Scanner(System.in);

    public BankAccount(int accountNumber, String accountHolderName , int balance , String accountType){

        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountType = accountType;
    }

    public void depositMoney(){

        System.out.println("Enter How much money you want to deposit");
        int depositMoney = scanner.nextInt();
        if ( depositMoney > 0 ){
            balance = balance + depositMoney;
            System.out.println("Moeny has been " + depositMoney + " Deposited to account");

        }else {

            System.out.println("Invalid Amount");
        }

    }

    public void withdrawMoney() {

        System.out.println("Enter How much money you want to withdraw");
        int withdrawMoney = scanner.nextInt();
        if (withdrawMoney > 0 && withdrawMoney <= balance) {
            balance = balance - withdrawMoney;
            System.out.println("Moeny has been " + withdrawMoney +" Withdraw from account");
        } else {
            System.out.println("Insufficient balance");
        }


    }
        public void display(){
            System.out.println("Account Number : "+accountNumber);
            System.out.println("Account Holdername : "+accountHolderName);
            System.out.println("Balance : " +balance);
            System.out.println("Account type : "+accountType);

            System.out.println("Do you want to deposit press 1 ");
            System.out.println("Do you want to withdraw press 2");
            int choice = scanner.nextInt();

            switch (choice){

                case 1:
                    depositMoney();
                    break;
                case 2:
                    withdrawMoney();
                    break;
                default:
                    System.out.println("Invalid entry");

            }
        }




    public static void main(String[] args) {
        BankAccount bnkac = new BankAccount(123,"Jay",1000,"Saving");
        bnkac.display();
    }

}
