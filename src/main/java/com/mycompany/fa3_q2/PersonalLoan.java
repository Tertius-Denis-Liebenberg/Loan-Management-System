package com.mycompany.fa3_q2;

/**
 *
 * @author Tertius
 */
public class PersonalLoan extends Loan{
    public PersonalLoan(double amount, String customerLastName, int term) {
        super(amount,customerLastName,term);
        this.interestRate *= 0.02;        
    }

    @Override
    public String toString() {
        return "Personal" + super.toString();  
    }
}
