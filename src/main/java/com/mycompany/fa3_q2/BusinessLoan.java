package com.mycompany.fa3_q2;

/**
 *
 * @author Tertius
 */
public class BusinessLoan extends Loan{
    public BusinessLoan(double amount, String customerLastName, int term){
        super(amount,customerLastName,term);
        this.interestRate *= 0.01;
    }

    @Override
    public String toString() {
        //To change body of generated methods, choose Tools | Templates.
        return "Business" + super.toString(); 
    }
}
