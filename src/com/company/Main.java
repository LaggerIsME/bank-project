package com.company;

public class Main {

    public static void main(String[] args) {
        User user1 = new User("Sadvakasov", "Oleg", "87320012300", "12345678");
        Wallet wallet1 = new Wallet(500.0, 200.0, 300.0);
        Transaction transaction = new Transaction();
        System.out.println(user1);
        System.out.println(wallet1);
        System.out.println(transaction.workWithMoney(wallet1, 250.0));
    }
}