package ma.enset.bdcc.benhima.ebank.repositories;

import ma.enset.bdcc.benhima.ebank.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount,String> {
}
