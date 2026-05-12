package com.meghana.monitoring.repository;

import com.meghana.monitoring.entity.Alert;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlertRepository extends JpaRepository<Alert, Long> {
}
