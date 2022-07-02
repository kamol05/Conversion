package com.octo.ru.card.repository;

import com.octo.ru.card.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepossitory extends JpaRepository<Card, Long> {
}
