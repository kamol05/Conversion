package com.octo.uzb.card.repository;

import com.octo.uzb.card.model.Bank;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankRepository extends JpaRepository<Bank, Long> {
}
