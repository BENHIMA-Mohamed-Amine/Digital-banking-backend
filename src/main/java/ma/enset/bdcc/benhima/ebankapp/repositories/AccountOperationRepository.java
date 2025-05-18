package ma.enset.bdcc.benhima.ebankapp.repositories;

import ma.enset.bdcc.benhima.ebankapp.entities.AccountOperation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountOperationRepository extends JpaRepository<AccountOperation, Long> {
}
