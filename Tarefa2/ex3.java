package Tarefa2;

import java.util.ArrayList;

public class ex3 {
    public static void main(String[] args) {
        Bank Bank1 = new Bank("AgileBank");
        Bank1.addNewBankAccounts(120.20f,1);
        BankAccount Account = Bank1.getBankAccount(1);
        Account.deposit(20.16f);
        System.out.println(Account.getFAmount());
    }
}

class Bank {
    private ArrayList<BankAccount> BankAccounts; 
    private String bankName;
    
    public Bank(ArrayList<BankAccount> BankAccounts, String bankName) {
        this.BankAccounts = BankAccounts;
        this.bankName = bankName;
    }   

    public Bank(String bankName) {
        this.BankAccounts = new ArrayList<>();
        this.bankName = bankName;
    }

    public ArrayList<BankAccount> getBankAccounts() {
        return BankAccounts;
    }

    public void addNewBankAccounts(float amount,int nAccount) {
        BankAccounts.add(new BankAccount(amount, nAccount));
    }

    public BankAccount getBankAccount(int nAccount) {
        for (BankAccount b: BankAccounts) {
            if (b.getnAccount() == nAccount){
                return b;
            }
        }
        return null;
    } 

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
} 


class BankAccount {
    private int amount;
    private int nAccount;
    
    public BankAccount(float amount, int nAccount) {
        setAmount(amount);
        this.nAccount = nAccount;
    }

    public int getIAmount() {
        return amount;
    }
    public float getFAmount() {
        return (float) amount / 100;
    }

    public void setAmount(int amount) {
        this.amount = amount * 100;
    }
    public void setAmount(float amount) {
        this.amount = (int) (amount * 100);
    }

    public void withDraw (float value) {
        amount -= value * 100;
    }
    public void deposit (float value) {
        amount += value * 100;
    }

    public int getnAccount() {
        return nAccount;
    }

    public void setnAccount(int nAccount) {
        this.nAccount = nAccount;
    } 
}
