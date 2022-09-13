package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private final Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        if (users.containsKey(user)) {
            System.out.println("Такой пользователь уже существует");
        } else {
            List<Account> account = new ArrayList<>();
            users.put(user, account);
        }
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user == null || users.get(user).contains(account)) {
            System.out.println("Ошибка данных пользователя");
        } else {
            users.get(user).add(account);
        }
    }

    public User findByPassport(String passport) {
        User rsl = null;
        for (User tmp : users.keySet()) {
            if (passport.equals(tmp.getPassport())) {
                rsl = tmp;
            }
        }
        return rsl;
    }

    public Account findByRequisite(String passport, String requisite) {
        Account result = null;
        User user = findByPassport(passport);
        if (user == null) {
            System.out.println("Пользователь не найден!");
        } else {
            List<Account> accounts = users.get(user);
            for (Account tmp : accounts) {
                if (tmp.getRequisite().equals(requisite)) {
                    result = tmp;
                }
            }
        }
        return result;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account srcAcc = findByRequisite(srcPassport, srcRequisite);
        Account destAcc = findByRequisite(destPassport, destRequisite);
        if (srcAcc != null && destAcc != null && srcAcc.getBalance() >= amount) {
            srcAcc.setBalance(srcAcc.getBalance() - amount);
            destAcc.setBalance(destAcc.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }

    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}
