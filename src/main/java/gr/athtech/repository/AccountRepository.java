package gr.athtech.repository;


import gr.athtech.domain.Account;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
    Account findByEmail(String email);
    Account findByphoneNumber(String phoneNumber);

}
