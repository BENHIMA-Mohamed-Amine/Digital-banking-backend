package ma.enset.bdcc.benhima.ebankapp.repositories;

import ma.enset.bdcc.benhima.ebankapp.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankAccountRepository extends JpaRepository<BankAccount, Long> {
}
