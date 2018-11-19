package com.whatsmode.statistics.repository;

import com.whatsmode.statistics.entity.PurchasingStatement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseRepository extends JpaRepository<PurchasingStatement, Long> {
}
