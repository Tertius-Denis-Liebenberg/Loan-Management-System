package com.mycompany.fa3_q2;

/**
 *
 * @author Tertius
 */
import java.time.LocalDateTime;
import java.util.*;
import java.text.*;
import java.time.LocalDate;

public abstract class Loan implements LoanConstants{
protected int loanNumber;
private static int id = 0;
protected double amount;
protected String customerLastName;
protected double interestRate;
protected double primeintersetRate;
protected int term;
protected int duedate;
int loanmax;

public Loan(double amount,String customerLastName, int term){
    loanNumber = id++;
    this.amount = amount;
    loanmax = 1000000;
    this.customerLastName = customerLastName;
    if(term == SHORT_TERM_LOAN || term == MEDIUM_TERM_LOAN || term == LONG_TERM_LOAN )
        this.term = term;
    else 
        this.term = SHORT_TERM_LOAN;
}
    @Override
    public String toString() {
        LocalDate dt = LocalDate.now();
        SimpleDateFormat fd = new SimpleDateFormat("yyyy-MM-dd");
        
        //To change body of generated methods, choose Tools | Templates.
        return"\nLoan No. "  + (loanNumber + 1)   + "\n"+       
              " Customer: " + customerLastName + "\n"+ 
              "============================================================================" + "\n" +             
              " amount: R" + amount        + "\n" +
              " rate: "   + interestRate  + "%\n" +
              " term: "   + term          + " year(s)\n" +
              " total amount owed at due date: " + dt.plusYears(term) + "\n" +
              " total amount owed: R"      + ((interestRate * amount)+ amount) + "\n" +
              "============================================================================"  + "\n" ;
    }
    public void setInterestRate(double interestRate){
    this.interestRate = interestRate;
    }
    public void setprimeinterestRate(double primeinterestRate){
    this.primeintersetRate = primeinterestRate;
    }
}
