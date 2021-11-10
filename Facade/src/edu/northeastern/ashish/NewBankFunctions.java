package edu.northeastern.ashish;

public class NewBankFunctions {
    private OldBankFunctions oldBankFunctions;

    public NewBankFunctions(){
        oldBankFunctions = new OldBankFunctions();
    }

    public float getBalance(String accountNumber, String phoneNumber){
        if(phoneNumber == ""){
            // or validate phone and account
            return  0.0f;
        }
        return oldBankFunctions.getBalance(accountNumber);
    }

    public void addMoney(String accountNumber, String phoneNumber, float money) {
        if (phoneNumber == "") {
            // or validate phone and account
            return;
        }
         oldBankFunctions.addMoney(accountNumber, money);
    }
    public void removeMoney(String accountNumber, String phoneNumber, float money){
        if(phoneNumber == ""){
            // or validate phone and account
            return ;
        }
         oldBankFunctions.removeMoney(accountNumber, money);
    }
}
