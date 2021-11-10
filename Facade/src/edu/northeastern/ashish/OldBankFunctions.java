package edu.northeastern.ashish;

public class OldBankFunctions {
    private float balance = 0.0f;

    public float getBalance(String account){
        return 1000000.00f;
    }

    public void addMoney(String account, float money ){
        balance += money;
    }

    public void removeMoney(String account, float money){
         balance -= money;
    }

}
