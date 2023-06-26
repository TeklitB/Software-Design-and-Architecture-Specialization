package structuraldesignpatterns.facadedesignpattern.accountclasses;

import structuraldesignpatterns.facadedesignpattern.accountinterfaces.IAccount;

import java.math.BigDecimal;

public class Saving implements IAccount {
    BigDecimal initAmount;

    public Saving(BigDecimal initAmount){
        this.initAmount = initAmount;
    }
    @Override
    public void deposit(BigDecimal amount) {

    }

    @Override
    public void withdraw(BigDecimal amount) {

    }

    @Override
    public void transfer(IAccount toAccount, BigDecimal amount) {

    }

    @Override
    public int getAccountNumber() {
        return 0;
    }
}
