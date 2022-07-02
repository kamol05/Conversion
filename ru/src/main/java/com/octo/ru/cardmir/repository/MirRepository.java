package com.octo.ru.cardmir.repository;

import com.octo.ru.cardmir.model.MirCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MirRepository extends JpaRepository<MirCard, Long> {
}
