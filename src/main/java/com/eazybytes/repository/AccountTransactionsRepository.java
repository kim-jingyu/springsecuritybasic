package com.eazybytes.repository;

import com.eazybytes.model.AccountTransactions;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountTransactionsRepository extends JpaRepository<AccountTransactions, String> {
    List<AccountTransactions> findByCustomerIdOrderByTransactionDtDesc(int customerId);
}
