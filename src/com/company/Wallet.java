package com.company;

public class Wallet {
    private Double money;
    private Double deposit;
    private Double credit;
    public Wallet(Double money, Double deposit, Double credit){
        setMoney(money);
        setDeposit(deposit);
        setCredit(credit);
    }
    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Double getDeposit() {
        return deposit;
    }

    public void setDeposit(Double deposit) {
        this.deposit = deposit;
    }

    public Double getCredit() {
        return credit;
    }

    public void setCredit(Double credit) {
        this.credit = credit;
    }
    @Override
    public String toString(){
        return "MONEY: " + getMoney() +"\n"+"DEPOSIT: " + getDeposit() +"\n"+"CREDIT: " + getCredit() ;
    }
}
