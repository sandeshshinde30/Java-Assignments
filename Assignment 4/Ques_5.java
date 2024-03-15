/*
    Ques : Create an abstract class 'Bank' with an abstract method 'getBalance'.
            $100, $150 and $200 are deposited in banks A, B and C respectively.
            'BankA', 'BankB' and 'BankC' are subclasses of class 'Bank', each having
            a method named 'getBalance'. Call this method by creating an object of
            each of the three classes.
 */

// Abstract class Bank
abstract class Bank {
    abstract int getBalance();
}

// Subclass BankA
class BankA extends Bank {
    private int balance = 100; 

   
    int getBalance() {
        return balance;
    }
}

// Subclass BankB
class BankB extends Bank {
    private int balance = 150; 

    
    int getBalance() {
        return balance;
    }
}

// Subclass BankC
class BankC extends Bank {
    private int balance = 200; 

    int getBalance() {
        return balance;
    }
}

class Ques_5{
    
    public static void main(String[] args) {
       
        BankA bankA = new BankA();
        BankB bankB = new BankB();
        BankC bankC = new BankC();

        System.out.println("Balance in BankA: $" + bankA.getBalance());
        System.out.println("Balance in BankB: $" + bankB.getBalance());
        System.out.println("Balance in BankC: $" + bankC.getBalance());
    }
} 
