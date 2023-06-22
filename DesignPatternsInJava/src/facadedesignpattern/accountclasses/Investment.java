package facadedesignpattern.accountclasses;

import facadedesignpattern.accountinterfaces.IAccount;

import java.math.BigDecimal;

public class Investment implements IAccount {
    BigDecimal initAmount;

    public Investment(BigDecimal initAmount) {
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
