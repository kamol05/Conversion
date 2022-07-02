package com.octo.ru.card.repository;

import com.octo.ru.card.model.Bank;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankRepository extends JpaRepository<Bank, Long> {
}
