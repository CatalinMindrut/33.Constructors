package com.Catalin;

public class BankAccount {
    private int accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    /** Turns out that Java is automatically creating a constructor for you when you create a class.
     * The "new Account()" actually calls this hidden constructor in the other class.
     * A constructor has to use the same name as the class and only has an access modifier and the name: public Account()...
     * The default constructor is used to provide the default values if none are set, like 0 or null.
     * Every time an object is created using new() keyword, at least one constructor is called. It is called a default constructor.
     * It is called constructor because it constructs the values at the time of object creation. It is not necessary
     * to write a constructor for a class because java compiler creates a default constructor if your class doesn't have any.
     * There are two types of constructors: default and parametrized constructors.
     * The constructor is used to initialize the state (fields) of an object while methods are used to expose the behavior
     * of an object.
     * The constructor never has a return value compared to a method (int, void, boolean, etc.)
     */
    public BankAccount(){

        /** You can also call a parametrized constructor into the default constructor in order to change the default values:
         */
        this(987987, 7000, "Default customer name", "Default email",
                "87986969");
        /** this() calls any other constructor that is part of this class. What constructor is called exactly can be
         * determined by the number of parameters.
         * Now the default values will no longer be 0 or null, but the values that were stated in the "this()" call.
         */
        System.out.println("Empty constructor called.");
    }
    /** Just like methods, constructors can be overloaded, provided that we change the parameters.
     */
    public BankAccount(int accountNumber, int balance, String customerName, String email, String phoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        System.out.println("Account constructor with parameters called."); // just to see if this constructor is called.
        /** The constructor is set to use the fields and update them as needed. This is a parametrized constructor.
         */
    }

    /** As mentioned before, this is the constructor that Java automatically creates. Typing it in again will just
     * tell Java that you are now creating your own constructor so it is going to override the default one.
     *
     *  You will generally have one major constructor that is being called in other smaller constructors.
     * To create constructors, setters or getters you can right click anywhere > Generate.
     */
    public BankAccount(String customerName, String email, String phoneNumber) {
        this(932424, 8000, customerName, email, phoneNumber);
        /** You can also set the default values in a constructor and call the rest of the values from the major constructor.
         */
    }



    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber(){
        return accountNumber;
    }
    public int getBalance() {
        return balance;
    }
    public String getCustomerName() {
        return customerName;
    }
    public String getEmail() {
        return email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void withdrawal(int amount){
        if(balance < amount){
            System.out.println("Insufficient funds.");
        } else {
            this.balance = balance - amount;
            System.out.println(amount + " lei were deducted from your account.");
            System.out.println("Remaining funds " + balance);
        }
    }

    public void deposit(int amount){
        this.balance = balance + amount;
        System.out.println(amount + " added to your account.");
        System.out.println("Current balance is " + balance);
    }
}
