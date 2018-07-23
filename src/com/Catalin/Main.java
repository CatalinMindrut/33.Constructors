package com.Catalin;

public class Main {

    public static void main(String[] args) {
        //Challenge
        //Create a new class for a bank account
        //Create fields for the account number, balance, customer name, email and phone number.
        //
        //Create getters and setters for each field
        //Create two additional methods
        //1. To allow the customer to deposit funds (this should increment the balance field);
        //2. To allow the customer to withdraw funds. This should deduct from the balance field,
        //but not allow the withdrawal to complete if there are insufficient funds.
        //You will want to create various code in the Main class (the one created by IntelliJ) to
        //confirm your code is working.
        //Add some System.out.println's in the two methods above as well.


//        BankAccount account = new BankAccount();
        /**This line calls the default constructor for the BankAccount class, specifically the "new BankAccount();.
         * new BankAccount actually calls a method inside the BankAccount class, called BankAccount.
         * This method is called a constructor and is automatically created by Java and hidden.
         * The constructor is only used to call the object that you are creating and it is only called once, at the start
         * when you are initializing the object.
         */
//        BankAccount account = new BankAccount(82632, 2000, "Catalin",
//                "catalin@gmail.com", "0749333999");
//        account.setAccountNumber(98736);
//        account.setBalance(5000);
//        account.setCustomerName("Catalin");
//        account.setEmail("catalin@mail.com");
//        account.setPhoneNumber("0767333833");
        /** All these values can be set in another constructor, in the BankAccount class.
         */

//        System.out.println("Customer's account number set to: " + account.getAccountNumber());
//        System.out.println("Customer's name is: " + account.getCustomerName());
//        System.out.println("The customer's email address is: " + account.getEmail());
//        System.out.println("The account balance is: "+ account.getBalance());
//        System.out.println("The customer's phone number is: " + account.getPhoneNumber());
//
//        System.out.println("*****************************");
//        account.deposit(380);
//        account.withdrawal(8000);
//
///////////////////////////////
//
//        BankAccount catalinAccount = new BankAccount("Catalin", "catalin@gmail.com", "07343883");
//        System.out.println(catalinAccount.getAccountNumber() + " name "+ catalinAccount.getCustomerName());

        //Challenge
        //Create a new class VipCustomer
        //it should have 3 fields name, credit limit and email address.
        //create 3 constructors
        //1st constructor empty should call the constructor with 3 parameters with default values
        //2nd constructor should pass on the 2 values it receives and add a default value for thr 3rd
        //3rd constructor should save all fields.
        //create getters only for this using code generation of IntelliJ as setters wont be needed
        //test and confirm it works.

        VipCustomer catalinAccount = new VipCustomer("Catalin", 93844, "catalin@gmail.com");
        System.out.println("User's name is " + catalinAccount.getName() + ", the credit limit is " + catalinAccount.getCreditLimit()
                + " and the email address is " + catalinAccount.getEmail());

        VipCustomer adiAccount = new VipCustomer("Adi", 93838);
        System.out.println(adiAccount.getName());

        VipCustomer dianaAccount = new VipCustomer();
        System.out.println(dianaAccount.getName());







    }
}
