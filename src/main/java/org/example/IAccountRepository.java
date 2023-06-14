package org.example;

public interface IAccountRepository extends IRepository<Account, Integer> {
    Account create(Account account);
    Account readById(Integer accountId);
    Account update(Account account);
    boolean delete(Account account);
    // Add specific methods for RolePlaySystemRepository here
}
