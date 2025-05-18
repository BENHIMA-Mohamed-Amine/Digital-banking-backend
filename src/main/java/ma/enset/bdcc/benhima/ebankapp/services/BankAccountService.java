package ma.enset.bdcc.benhima.ebankapp.services;

import ma.enset.bdcc.benhima.ebankapp.entities.BankAccount;
import ma.enset.bdcc.benhima.ebankapp.entities.Customer;

import java.util.List;

public interface BankAccountService {
    Customer saveCustomer(Customer customer);
    BankAccount saveBankAccount(double initialBalance, String type, Long customerId);
    List<Customer> findAllCustomers();
    BankAccount findBankAccountById(Long id);
    void debit(Long id, double amount);
    void credit(Long id, double amount);
    void transfer(Long id, double amount, Long targetId);
}
