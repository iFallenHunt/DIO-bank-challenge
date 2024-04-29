# Bank Account Class

This Java program defines a  `BankAccount`  class that represents a simple bank account with attributes such as account number, agency, client name, and balance.

The class provides methods to set and get these attributes, as well as a method to create a new account via the terminal and display a message confirming the account creation.

## Features
-  `BankAccount`  class with attributes: number, agency, clientName, balance

- Getter and setter methods for each attribute

-  `createAccountViaTerminal()`  method to create a new account via user input

-  `displayAccountCreatedMessage()`  method to display a confirmation message with account details

## Usage
1. Create a new  `BankAccount`  object by providing the account number, agency, client's name, and balance.

2. Use the  `createAccountViaTerminal()`  method to create an account via terminal input.

3. Display a confirmation message with account details using the  `displayAccountCreatedMessage()`  method.


## How to Use
1. Create a new  `BankAccount`  object:
BankAccount account = new BankAccount(12345, "Main Branch", "John Doe", 1000.0);

2. Create a new account via terminal input:
BankAccount newAccount = BankAccount.createAccountViaTerminal();

3. Display a confirmation message:
account.displayAccountCreatedMessage();
🏦 Happy banking! 🤑



### License
This project is licensed under the MIT License. See the [LICENSE](https://github.com/iFallenHunt/DIO-bank-challenge/blob/main/LICENSE) file for details.

