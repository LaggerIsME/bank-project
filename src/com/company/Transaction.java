package com.company;

public class Transaction {
        public String workWithMoney(Wallet wallet, Double money){
           wallet.setMoney(wallet.getMoney() + money);
           return "Your money is " + wallet.getMoney();
        }
        public String workWithCredit(Wallet wallet, Double credit){
            wallet.setCredit(wallet.getCredit() + credit);
            return "Your deposit is " + wallet.getCredit();
        }
        public String workWithDeposit(Wallet wallet, Double deposit){
            wallet.setCredit(wallet.getDeposit() + deposit);
            return "Your deposit is " + wallet.getDeposit();
        }



}
