# Loan Management System

This project is a simple yet effective demonstration of a loan management system. It allows users to create both personal and business loans, specifying key parameters such as the loan amount, customer's last name, and the loan term. The system then calculates the interest rate based on the loan type and displays detailed information about each loan, including the total amount owed at the due date and the total amount owed.

## Key Components

### `CreateLoans.java`

- **Purpose**: Acts as the main entry point of the application. It collects necessary details for creating loans, validates these inputs, and creates instances of `Loan`, `BusinessLoan`, or `PersonalLoan` based on the user's choice.
- **Features**:
  - Retrieves the current prime interest rate from the user.
  - Prompts the user to specify the loan type (business or personal).
  - Collects the loan amount, ensuring it does not exceed 100,000.
  - Obtains the customer's last name, validating that it contains only alphabetic characters.
  - Determines the loan term, allowing only 1, 3, or 5 years.
  - Validates the loan type selection and sets the interest rate accordingly.
  - Displays detailed information about each loan using `JOptionPane`.

### `Loan.java`

- **Purpose**: An abstract base class representing a generic loan. It includes properties common to all loans, such as the loan amount, customer's last name, interest rate, and term. It also provides a method to set the interest rate.
- **Features**:
  - Inherits from `LoanConstants` to define standard terms for loan durations.
  - Calculates the due date based on the term.
  - Provides a `toString()` method to display comprehensive loan details.

### `LoanConstants.java`

- **Purpose**: Defines constants for standard loan durations (short, medium, long).

### `BusinessLoan.java`

- **Purpose**: Extends `Loan` to represent business loans. It overrides the `toString()` method to include the loan type in the output.
- **Features**:
  - Sets the interest rate specifically for business loans.
  - Overrides the `toString()` method to prepend "Business" to the loan details.

### `PersonalLoan.java`

- **Purpose**: Extends `Loan` to represent personal loans. It overrides the `toString()` method to include the loan type in the output.
- **Features**:
  - Sets the interest rate specifically for personal loans.
  - Overrides the `toString()` method to prepend "Personal" to the loan details.

## Usage

1. Run `CreateLoans.java`.
2. Follow the prompts to input loan details.
3. Review the detailed information about each loan.

## Author

**Tertius Denis Liebenberg**  

For any questions or feedback, please contact [tertiusliebenberg7@gmail.com].