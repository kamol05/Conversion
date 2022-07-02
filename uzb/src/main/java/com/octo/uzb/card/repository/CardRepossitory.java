package com.octo.uzb.card.repository;

import com.octo.uzb.card.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepossitory extends JpaRepository<Card, Long> {
}
