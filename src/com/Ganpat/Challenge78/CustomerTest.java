package com.Ganpat.Challenge78;

public class CustomerTest {
    public static void main(String[] args) {
        bankAccount gan = new bankAccount("Ganpat kumar",0012);
        gan.depositMoney(45);
        gan.withdrawlMoney(50);
        gan.withdrawlMoney(-50);
        gan.depositMoney(-80);
    }
}
