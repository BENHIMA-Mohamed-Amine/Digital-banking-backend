package ma.enset.bdcc.benhima.ebankapp.repositories;

import ma.enset.bdcc.benhima.ebankapp.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}

