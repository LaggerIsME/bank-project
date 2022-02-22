package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        User user1 = new User("Sadvakasov", "Oleg", "87320012300", "12345678"); //500 ТГ ВЕЗДЕ
        User user2 = new User("Rakhymov", "Nikolay", "88005553535", "87654321");
        User user3 = new User("Chernishevskiy", "Aleksey", "87732034323", "00088899");
        User[] users = new User[3];
        users[0] = user1;
        users[1] = user2;
        users[2] = user3;
        Bank bank1 = new Bank(users);
        Validator validator1 = new Validator();
        Scanner input = new Scanner(System.in);
        boolean a = false;
        User usercheck = new User();
        while(!a) {
            System.out.println("Введите имя пользователя");
            String name = input.next();
            System.out.println("Введите фамилию пользователя");
            String surname = input.next();
            System.out.println("Введите номер пользователя");
            String number = input.next();
            System.out.println("Введите пароль пользователя");
            String password = input.next();
            usercheck.setSurname(surname);
            usercheck.setName(name);
            usercheck.setNumber(number);
            usercheck.setPassword(password);
            if(validator1.checker(usercheck, bank1.getUsers())){
                a = true;
                System.out.println("Есть такой пользователь");
            }else{
                System.out.println("Нет такого пользователя");
                break;
            }
        }
        System.out.println("С каким счетом вы желаете работать?");
        System.out.println("1 - ЛИЧНЫЙ СЧЕТ, 2 - ДЕПОЗИТ, 3 - КРЕДИТ");
        String number1 = input.next();
            System.out.println("Какую операцию желаете выбрать?");
            System.out.println("1 - ПОКАЗАТЬ СЧЕТ, 2 - СНЯТЬ ДЕНЬГИ, 3 - ВНЕСТИ ДЕНЬГИ");
            String number2 = input.next();
            if(number2.equals("1")){
               if(number1.equals("1")){
                   System.out.println("На счету: " + usercheck.getWallet().getMoney());
               }
               if(number1.equals("2")){
                   System.out.println("На депозите: " + usercheck.getWallet().getDeposit());
               }
               if(number1.equals("3")){
                   System.out.println("Кредит равен: " + usercheck.getWallet().getCredit());
               }
            }
        if(number2.equals("2")){
            System.out.println("Какую сумму?");
            Double cost = input.nextDouble();
            if(number1.equals("1")){
                if(cost > usercheck.getWallet().getMoney()){
                    System.out.println("Недостаточно средств!");
                }else{
                    usercheck.getWallet().setMoney(usercheck.getWallet().getMoney()-cost);
                    System.out.println("Осталось на счету: " + usercheck.getWallet().getMoney());
                }
            }
            if(number1.equals("2")){
                if(cost > usercheck.getWallet().getDeposit()){
                    System.out.println("Недостаточно средств!");
                }else{
                    usercheck.getWallet().setDeposit(usercheck.getWallet().getDeposit()-cost);
                    System.out.println("Осталось на депозите: " + usercheck.getWallet().getDeposit());
                }
            }
            if(number1.equals("3")){
                usercheck.getWallet().setCredit(usercheck.getWallet().getCredit()+cost);
                System.out.println("Кредит равен: " + usercheck.getWallet().getCredit());
            }
        }
        if(number2.equals("3")){
            System.out.println("Какую сумму?");
            Double cost = input.nextDouble();
            if(number1.equals("1")){
                    usercheck.getWallet().setMoney(usercheck.getWallet().getMoney()+cost);
                    System.out.println("Осталось на счету: " + usercheck.getWallet().getMoney());
            }
            if(number1.equals("2")){
                    usercheck.getWallet().setDeposit(usercheck.getWallet().getDeposit()+cost);
                    System.out.println("Осталось на депозите: " + usercheck.getWallet().getDeposit());
            }
            if(number1.equals("3")){
                usercheck.getWallet().setCredit(usercheck.getWallet().getCredit()-cost);
                System.out.println("Кредит равен: " + usercheck.getWallet().getCredit());
            }
        }
    }
}