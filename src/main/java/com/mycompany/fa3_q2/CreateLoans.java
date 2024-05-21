package com.mycompany.fa3_q2;
import java.util.Scanner;

import javax.swing.JOptionPane;
public class CreateLoans {
    //Create 5 Loan objects
    public static Loan[] loans = new Loan[5];
    
    //Creating public variables
    public static Scanner in = new Scanner(System.in);
    public static double primeInterestRate;
    public static int num;
    public static int i;
    public static double amount;
    public static String lastName;
    public static int term;
    
    public static void main(String[] args) {
        try {
            getRate();
            

            //The for loop iterates through the following data process 5 times for each object
            for(i = 0; i < 5; i++){
                getType();
                getAmount();
                getLastname();
                getPeriod();
                finalValidation();
            } 
            for(Loan loan : loans)
                JOptionPane.showMessageDialog(null, loan.toString());
        }
        //Catch unwanted errors 
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "An error has occurred " + e.getMessage());
            main(args);
        }
    }
    
    // Retrieves the current prime interest rate from the user
    public static void getRate(){
        do{
            // primeInterestRate is your default input and  primeinterestRate as constructor
            primeInterestRate = Double.parseDouble(JOptionPane.showInputDialog("Please enter the current prime interest rate: "));
            
            // Validate
            if (primeInterestRate <= 0)
            JOptionPane.showMessageDialog(null, "The Interest rate can not be less or equel to 0");
        }while (primeInterestRate <= 0);
    }
    
    // Retrieves Loan type from user
    public static void getType(){
        // This number will later be used to decide the loan type
        try{
            num = Integer.parseInt(JOptionPane.showInputDialog("Please enter the loan Number " + (i+1) + "'s type: \n1. Business \n2. Personal"));
        }
        
        // Catches formatting errors
        catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "You entered an invalid character type. \nPlease enter number 1 or 2");
            getType();
        }
    }
    
    // Retrieves Amoount from user
    public static void getAmount(){
        try{
            do{
                amount = Double.parseDouble(JOptionPane.showInputDialog("Enter the amount: "));
                
                // Validate
                if(amount > 100000)
                JOptionPane.showMessageDialog(null, "Amount too high, please enter an amount up to 100,000");
            }while(amount > 100000);
        }
        
        // Catches formatting errors
        catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "You entered an invalid character type. \nPlease enter number 1 or 2");
            getAmount();
        }
    }
    
    // Retrieves last name of customer
    public static void getLastname(){
        try{
            lastName = JOptionPane.showInputDialog("\nEnter your Last Name: ");
            
            // Validate
            int number = Integer.parseInt(lastName);
            JOptionPane.showMessageDialog(null, "This instance cannot be numbers!");
            getLastname();
        }catch (NumberFormatException ex){
            
        }
    }
    
    // Retrieves Loan period for customer
    public static void getPeriod(){
        try{
            term = Integer.parseInt(JOptionPane.showInputDialog("\nFor how many years do you want your loan(pick 1,3 or 5): "));
            
            // Validate
            if (term == 1 || term == 3 || term == 5){
            }else{
                JOptionPane.showMessageDialog(null, "Please enters 1, 3 or 5");
                getPeriod();
            }
        }catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "You entered an invalid character type");
            getPeriod();
        }
    }
    
    // Final validation of loan type
    public static void finalValidation(){
        //if variable type is equal to business it will select a businessLoan else PersonalLoan by default.
        if  (num == 1){
            loans[i] = new BusinessLoan(amount,lastName,term);          
        }else if (num == 2){
            loans[i]= new PersonalLoan(amount,lastName,term);
        }else{
            JOptionPane.showMessageDialog(null, "Please choose either 1 or 2");
            getType();
            finalValidation();
        }
        loans[i].setInterestRate(primeInterestRate);
    }
}
