package org.example.task_1.BankAccount;

import org.example.task_1.Printable;

// шаблон для осздания объектов
public class BankAccount implements Printable {
    private String accountNumber;
    private int balance;

    // settes'ы, устанавливают значения внуть приватного поля
    public void setBalance(int balance){
        this.balance = balance; // для поля balance из 5 строки этого класса применить balance, переданный в метод в с. 7
    }

    // getter'ы, получают значение поля
    public int getBalance() {
        return balance;
    }

    @Override
    public void print() {
        System.out.println("Account balance is " + this.balance);
    }
}
