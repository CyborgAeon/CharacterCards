package org.example;

import java.util.Arrays;
import java.util.List;

public class AccountRepository implements IAccountRepository {
    @Override
    public Account create(Account account){
        return new Account(account.getId(), account.getEmailAddress(), account.getPassword(), null);
    }
    @Override
    public Account readById(Integer accountId) {
        return new Account(accountId, toString(), "password", null);
    }
    @Override
    public Account update(Account account){
        var id = 0;
        if (account != null) id = account.getId();
        return readById(id);
    }
    @Override
    public boolean delete(Account account){
        return false;
    }
}
