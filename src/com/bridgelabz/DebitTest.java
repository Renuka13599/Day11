package com.bridgelabz;
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

