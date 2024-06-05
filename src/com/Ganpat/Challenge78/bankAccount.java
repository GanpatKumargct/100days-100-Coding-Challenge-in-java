package com.Ganpat.Challenge78;

public class bankAccount {

    private String AcHolderName;
    private long AccountNumber;
    private double Balence;

    public bankAccount(String acHolderName, long accountNumber) {
        AcHolderName = acHolderName;
        AccountNumber = accountNumber;

    }

    public void depositMoney(double money){
        if(money <=0){
            System.out.println("Invalid Deposit.");
        }else {
            Balence += money;
            System.out.println("Deposit Successful.");
            System.out.println("Total Balance is : "+Balence);
        }

    }

    public double withdrawlMoney(double money){
        if (money <= 0) {
            System.out.println("Invalid Withdrawl.");
        } else if (Balence >= money ) {
            Balence -= money;
            System.out.println("Transaction is successful.");
            System.out.println("Remaining Balance is : "+Balence);
        } else {
            money = Balence;
            Balence = 0;
            System.out.println("Your Withdrawl ammount is : "+money);
            System.out.println("Balence is : "+Balence);
        }

        return money;
    }


}
