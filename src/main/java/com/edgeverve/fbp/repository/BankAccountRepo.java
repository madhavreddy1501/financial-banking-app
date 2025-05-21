package com.edgeverve.fbp.repository;

import com.edgeverve.fbp.entity.OperativeAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankAccountRepo extends JpaRepository<OperativeAccount,Long> {
}
