package com.octo.uzb.cardhumo.repository;

import com.octo.uzb.cardhumo.model.HumoCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HumoRepository extends JpaRepository<HumoCard, Long> {
}
