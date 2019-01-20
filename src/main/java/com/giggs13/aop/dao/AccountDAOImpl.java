package com.giggs13.aop.dao;

import com.giggs13.aop.entity.Account;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDAOImpl
        implements AccountDAO {

    @Override
    public void addAccount(Account account,
                           boolean vip) {
        System.out.println(getClass() + ": DOING MY DB WORK: ADDING AN ACCOUNT");
    }

    @Override
    public boolean doWork() {
        System.out.println(getClass() + ": DOING MY WORK");

        return true;
    }
}
