package com.bridgelabz;
/**
 * @author Renu
 * @date :31/10/21
 *
 * Modify class Account  to provide a method called debit that withdraws money from an Account.
 * Ensure that the debit amount does not exceed the Account's balance.
 * If it does, the balance should be left unchanged and the method should print a message indicating
 * "Debit amount exceeded account balance."
 * Modify class AccountTest to test method debit.
 *
 */
import java.util.*;

public class DebitTest {
    public static void main(String[] args)
    {
        DebitCardComputation account1 = new DebitCardComputation( 50.00 ); // create debit object
        DebitCardComputation account2 = new DebitCardComputation( -7.53 ); // create debit object

        // display initial balance of each object
        System.out.printf( "account1 balance: $%.2f\n", account1.getBalance() );
        System.out.printf( "account2 balance: $%.2f\n\n", account2.getBalance() );

        // create Scanner to obtain input
        Scanner input = new Scanner ( System.in );
        double withdrawAmount; // debit amount read from user

        System.out.print( "Enter debit amount for account1: " );
        withdrawAmount = input.nextDouble(); // obtain user input
        System.out.printf("\ndeducting %.2f from account1 balance\n\n", withdrawAmount );
        account1.debit(withdrawAmount); // deduct from account1 balance

        // display balances
        System.out.printf( "account1 balance: $%.2f\n", account1.getBalance() );
        System.out.printf( "account2 balance: $%.2f\n\n", account2.getBalance() );

        System.out.print( "Enter withdraw amount for account2: "); // prompt
        withdrawAmount = input.nextDouble(); // obtain user input
        System.out.printf( "\ndeducting %.2f from account2 balance\n\n", withdrawAmount );
        account2.debit( withdrawAmount ); //deduct from account2 balance

        // display balances
        System.out.printf( "account1 balance: $%.2f\n", account1.getBalance() );
        System.out.printf( "account2 balance: $%.2f\n", account2.getBalance() );
    } // end main
} // end class

